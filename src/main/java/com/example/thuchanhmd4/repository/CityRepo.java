package com.example.thuchanhmd4.repository;

import com.example.thuchanhmd4.model.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepo extends CrudRepository <City, Integer>{
    List<City> findAllByNameContaining(String name);
}
