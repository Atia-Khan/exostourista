package com.atia.existourist.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atia.existourist.Model.Travelor;
import com.atia.existourist.Repository.ITravelorRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
@RequestMapping("/travelor")
public class TravelorController {
    
    @Autowired
    private ITravelorRepository travelorRepo;

    @PostMapping(value="/post")
    public ResponseEntity<?> postTravelor(@RequestBody Travelor user) {
        travelorRepo.save(user);
        
        return  ResponseEntity.ok("Travelor's info Added!") ;
    }
    

    @GetMapping("/get")
    public List<Travelor> getTravelor(){
      return  travelorRepo.findAll();
        
    }


    @GetMapping("/get/{id}")
    public Optional<Travelor> getById(@PathVariable Long id){
        return travelorRepo.findById(id);
    }
}
