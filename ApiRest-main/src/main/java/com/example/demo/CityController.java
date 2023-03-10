package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Sakila")
public class CityController {

    @Autowired
    CityRepository CityRepository;   


@GetMapping("/city")

public List<City> findAll(){
  return CityRepository.findAll();
}
 @GetMapping("/city/{id}")
 public Optional<City> findById(@PathVariable Integer id){
     return CityRepository.findById(id);
 }

    
}
