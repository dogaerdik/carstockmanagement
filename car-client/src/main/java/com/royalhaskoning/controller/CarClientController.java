package com.royalhaskoning.controller;

import com.royalhaskoning.carstockmanagement.model.CarInformation;
import com.royalhaskoning.carstockmanagement.model.SearchRequest;
import com.royalhaskoning.carstockmanagement.model.SearchResponse;
import com.royalhaskoning.dto.CarDto;
import com.royalhaskoning.dto.SearchRequestDto;
import com.royalhaskoning.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class CarClientController {
    @Autowired
    private CarService carService;

    @PostMapping(value = "/v1/cars")
    public void saveCar(@RequestBody CarDto carDto) {
        log.info("A car is creating... ");
        carService.saveCar(carDto);
        log.info("A car has created! ");
    }

    @PostMapping(value = "/v1/searchcar")
    public List<CarDto> searchCar(@RequestBody SearchRequestDto searchRequestDto) {
        log.info("Search Query starting... ");
        return searchResponseMaptoCarDtoList(carService.searchCar(SearchRequestDtoMaptoSearchRequest(searchRequestDto)));
    }

    public List<CarDto> searchResponseMaptoCarDtoList(SearchResponse response)
    {
        CarDto carDto = new CarDto();
        List<CarDto> carDtoList = new ArrayList<>();

        for (CarInformation carInformation : response.getCarInformationListList()) {
            carDto.setVersion(carInformation.getVersion());
            carDto.setPrice(carInformation.getPrice());
            carDto.setMake(carInformation.getMake());
            carDto.setModel(carInformation.getModel());
            carDto.setFuelConsumption(carInformation.getFuelConsumption());
            carDto.setAnnualMaintenanceCost(carInformation.getAnnualMaintenanceCost());
            carDto.setYearOfRelease(carInformation.getYearOfRelease());
            carDtoList.add(carDto);
        }
        return carDtoList;
    }
    public SearchRequest SearchRequestDtoMaptoSearchRequest(SearchRequestDto searchRequestDto)
    {
        return SearchRequest.newBuilder()
                .setMake(searchRequestDto.getMake())
                .setYearOfRelease(searchRequestDto.getYearOfRelease())
                .build();
    }


}