package com.royalhaskoning.service;

import com.royalhaskoning.carstockmanagement.model.*;
import com.royalhaskoning.entity.Car;
import com.royalhaskoning.repository.CarRepository;
import com.royalhaskoning.spec.SearchFilterSpec;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

import javax.transaction.Transactional;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@GrpcService
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class CarService extends CarServiceGrpc.CarServiceImplBase {
    private final CarRepository carRepository;
    private final ModelMapper mapper;

    @Override
    @Transactional
    public void saveCar(CarSaveRequest request, StreamObserver<CarSaveResponse> responseObserver) {
        log.info("A car is creating... ");
        responseObserver.onNext(Optional.of(mapper.map(request.getCarInformation(), Car.class))
                .map(this.carRepository::save)
                .map(car -> mapper.map(car, CarSaveResponse.class))
                .orElse(null));
        responseObserver.onCompleted();
        log.info("A car was created... ");
    }
    @Override
    public void searchCar(SearchRequest request, StreamObserver<SearchResponse> responseObserver) {
        log.info("The search query is starting... ");
        List<CarInformation> carInformationList = this.carRepository.findAll(SearchFilterSpec.searchCar(request))
                .stream()
                .map(car -> CarInformation.newBuilder()
                        .setVersion(car.getVersion())
                        .setYearOfRelease(car.getYearOfRelease())
                        .setPrice(car.getPrice())
                        .setModel(car.getModel())
                        .setMake(car.getMake())
                        .setFuelConsumption(car.getFuelConsumption())
                        .setAnnualMaintenanceCost(car.getAnnualMaintenanceCost())
                        .build())
                .collect(Collectors.toList());
        responseObserver.onNext(SearchResponse.newBuilder().addAllCarInformationList(carInformationList).build());
        responseObserver.onCompleted();
        log.info("The search query was completed... ");
    }

    @Override
    public void searchLowestTotalAnnualCost(LowestTotalAnnualCostRequest request, StreamObserver<LowestTotalAnnualCostResponse> responseObserver)
    {
        log.info("The lowest total annual cost is calculating... ");
        responseObserver.onNext(calculateLowestTotalAnnualCost(request));
        responseObserver.onCompleted();
        log.info("The lowest total annual cost was calculated... ");
    }

    public LowestTotalAnnualCostResponse calculateLowestTotalAnnualCost(LowestTotalAnnualCostRequest request)
    {
        List<LowestTotalAnnualCostInformation> lowestTotalAnnualCostInformationlist = new ArrayList<>();

        this.carRepository.findAll().stream().collect(Collectors.toList()).stream().forEach(
        car -> lowestTotalAnnualCostInformationlist.add(LowestTotalAnnualCostInformation.newBuilder()
                .setAnnualMaintenanceCost(car.getAnnualMaintenanceCost())
                .setTotalAnnualCost((request.getExpectedDistance() * request.getPriceOfFuel() * car.getFuelConsumption() * 48) + car.getPrice() + (car.getAnnualMaintenanceCost() * 4))
                .setMake(car.getMake())
                .setModel(car.getModel())
                .setVersion(car.getVersion())
                .setFuelConsumption(car.getFuelConsumption())
                .setPrice(car.getPrice())
                .setYearOfRelease(car.getYearOfRelease()).build()));
        return LowestTotalAnnualCostResponse.newBuilder()
                .addAllLowestTotalAnnualCostList(lowestTotalAnnualCostInformationlist.stream().sorted(Comparator.comparingDouble(LowestTotalAnnualCostInformation::getTotalAnnualCost)).toList()).build();


    }
}