package com.example.thuchanhmd4.controller;


import com.example.thuchanhmd4.model.City;
import com.example.thuchanhmd4.model.Country;
import com.example.thuchanhmd4.service.ICityService;
import com.example.thuchanhmd4.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class CityController {
    @Autowired
    ICityService cityService;
    @Autowired
    ICountryService countryService;
    @GetMapping
    public ResponseEntity<List<City>> getListCity() {
        return new ResponseEntity<>(cityService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Country>> getListCountry() {
        return new ResponseEntity<>(countryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCity(@PathVariable int id) {
        return new ResponseEntity(cityService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<City>> search(@PathVariable String name) {
        return new ResponseEntity(cityService.findByName(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<City> addCity(@RequestBody City city) {
        cityService.save(city);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<City> updateCity(@RequestBody City city) {
        cityService.save(city);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCity(@PathVariable int id) {
        cityService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
