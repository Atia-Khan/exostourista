package com.atia.existourist.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="hotels")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Hotel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String imgLink;
    private String hotelName;
    private String location;
    private boolean isPool;
    private String experienceLevel;
    private double pricePerNight;
  
    private String description;
@Column(length = 1000)
    private String longDesc;

    
}
