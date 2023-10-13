package com.allane.carrental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    //TODO Change the date type
    private Date birthdate;

    @OneToMany(mappedBy = "customer")
    private List<LeasingContract> leasingContracts;

}
