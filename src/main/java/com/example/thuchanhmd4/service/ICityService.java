package com.example.thuchanhmd4.service;

import com.example.thuchanhmd4.model.City;

import java.util.List;

public interface ICityService {
    List<City> findAll();
    void save(City city);
    void delete(int id);
    City findById(int id);
    List<City> findByName(String name);
}
