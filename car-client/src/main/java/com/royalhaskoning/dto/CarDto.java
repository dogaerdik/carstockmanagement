package com.royalhaskoning.dto;

import lombok.Data;

@Data
public class CarDto {
    private String model;
    private String make;
    private String version;
    private Integer yearOfRelease;
    private Double price;
    private Double fuelConsumption;
    private Double annualMaintenanceCost;
}
