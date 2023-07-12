package com.atia.existourist.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity (name = "Travelors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Travelor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private String address;
    private String email;
    private Date arival;
    private Date departure;
    private double totalPrice;
    private double totalPriceWithTax;


}
