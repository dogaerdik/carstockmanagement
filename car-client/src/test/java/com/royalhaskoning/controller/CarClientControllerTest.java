package com.royalhaskoning.controller;

import com.royalhaskoning.carstockmanagement.model.CarDto;
import com.royalhaskoning.carstockmanagement.model.CarSaveRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CarClientControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate testRestTemplate;
    private String buildApiPath(String endPoint) {
        String baseURL = "http://localhost:"+port+"/v1/cars";
        String apiPath = baseURL+endPoint;
        return apiPath;
    }

    @Test
    void saveCar() {
        HttpHeaders headers = new HttpHeaders();

        CarSaveRequest carSaveRequest = CarSaveRequest.newBuilder().setCarDto(CarDto.newBuilder()
                .setMake("Kia")
                .setModel("Rio")
                .setAnnualMaintenanceCost(500L)
                .setFuelConsumption("5 liter in 100 km.")
                .setPrice(76000L)
                .setYear(2022)).build();
        HttpEntity<CarSaveRequest> requestEntity = new HttpEntity<>(carSaveRequest, headers);

        //When
        testRestTemplate.exchange(buildApiPath(""),HttpMethod.POST,requestEntity, Object.class);

    }
}