package com.allane.carrental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private int modelYear;
    private String vin;
    private BigDecimal price;
    @OneToOne
    @JoinColumn(name = "leasing_contract_id")
    private LeasingContract leasingContract;
}
