package com.royalhaskoning.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model;
    private String make;
    private String version;
    private Integer yearOfRelease;
    private Double price;
    private Double fuelConsumption;
    private Double annualMaintenanceCost;
    @CreatedDate
    private Date createdDate;
}
