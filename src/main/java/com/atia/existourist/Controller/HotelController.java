package com.atia.existourist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.atia.existourist.Model.Hotel;
import com.atia.existourist.Repository.IHotelRepository;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



//http://localhost:8082/hotels/getAllHotels
@CrossOrigin("*")
@RestController
@RequestMapping("/hotels")
public class HotelController {
    
    @Autowired
    private IHotelRepository hotelRepo;

    // @PostMapping(value="/search")
    // public ResponseEntity<List<Hotel>> searchHotels(@RequestBody HotelSearchFilter searchFilters) {
    //     String city = searchFilters.getLocation();
    //     String experienceLevel = searchFilters.getExperienceLevel();
    //     Boolean poolRequired = searchFilters.isPoolRequired();


    // //   List<Hotel> matchedHotels = hotelRepo.findByCityOrExperienceOrPoolRequired(city, experienceLevel, poolRequired);

    // List<Hotel> matchedHotels;

    // if(city != null && experienceLevel != null && poolRequired != null){
    //     matchedHotels = hotelRepo.findByCityOrExperienceOrPoolRequired(city, experienceLevel, poolRequired);
    // } else if (city != null && experienceLevel != null){
    //     matchedHotels = hotelRepo.findByCityAndExperience(city, experienceLevel);

    // } else if(city != null && poolRequired != null){
    //     matchedHotels = hotelRepo.findByCityAndPool(city, poolRequired);
    // } else if(experienceLevel != null && poolRequired != null){
    //     matchedHotels = hotelRepo.findByExperienceAndPool(experienceLevel, poolRequired);
    // } else if(city != null){
    //     matchedHotels = hotelRepo.findByCity(city);
    // } else if(experienceLevel != null){
    //     matchedHotels = hotelRepo.findByExperience(experienceLevel);
    // } else if(poolRequired != null){
    //     matchedHotels = hotelRepo.findByPoolRequired(poolRequired);
    // }else {
    //     matchedHotels = hotelRepo.findAll();
    // }
    //     return ResponseEntity.ok(matchedHotels) ;
    // }
    
@GetMapping(value="/getAllHotels")
public List<Hotel> getAllHotels() {
    return hotelRepo.findAll();
}

@GetMapping("/get/{id}")
 public Hotel getHotelById(@PathVariable Long id){
return hotelRepo.findById(id).orElse(null);
 }

@PostMapping("/post")
public Hotel postHotel(@RequestBody Hotel hotels){
    return hotelRepo.save(hotels);
}

@PostMapping("/postall")
public List<Hotel> postHotel(@RequestBody List<Hotel> hotels) {
    return hotelRepo.saveAll(hotels);
}


}
