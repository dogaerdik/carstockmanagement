package com.royalhaskoning.service;

import com.royalhaskoning.carstockmanagement.model.CarInformation;
import com.royalhaskoning.carstockmanagement.model.CarSaveRequest;
import com.royalhaskoning.carstockmanagement.model.SearchRequest;
import com.royalhaskoning.carstockmanagement.model.SearchResponse;
import com.royalhaskoning.dto.CarDto;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.royalhaskoning.carstockmanagement.model.CarServiceGrpc.CarServiceBlockingStub;
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CarService {
    private  final ModelMapper mapper;
    @GrpcClient("car-server")
    private CarServiceBlockingStub carStub;

    public void saveCar(CarDto carDto){
        carStub.saveCar(mapCarDto(carDto));
    }

    public SearchResponse searchCar(SearchRequest searchRequest){
        return carStub.searchCar(searchRequest);
    }

    public CarSaveRequest mapCarDto(CarDto carDto)
    {
        CarInformation carInformation =CarInformation.newBuilder()
                .setMake(carDto.getMake())
                .setAnnualMaintenanceCost(carDto.getAnnualMaintenanceCost())
                .setFuelConsumption(carDto.getFuelConsumption())
                .setModel(carDto.getModel())
                .setPrice(carDto.getPrice())
                .setYearOfRelease(carDto.getYearOfRelease())
                .setVersion(carDto.getVersion()).build();
        return CarSaveRequest.newBuilder().setCarInformation(carInformation).build();
    }
}
