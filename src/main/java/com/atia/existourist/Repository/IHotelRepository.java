package com.atia.existourist.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atia.existourist.Model.Hotel;


@Repository
public interface IHotelRepository extends JpaRepository<Hotel, Long> {

    // List<Hotel> findByCityOrExperienceOrPoolRequired(String city, String experienceLevel, Boolean poolRequired);

   
    
}
