package com.example.thuchanhmd4.service;


import com.example.thuchanhmd4.model.City;
import com.example.thuchanhmd4.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{
    @Autowired
    CityRepo cityRepo;

    @Override
    public List<City> findAll() {
        return (List<City>) cityRepo.findAll();
    }

    @Override
    public void save(City city) {
        cityRepo.save(city);
    }

    @Override
    public void delete(int id) {
        cityRepo.deleteById(id);
    }

    @Override
    public City findById(int id) {
        return cityRepo.findById(id).get();
    }

    @Override
    public List<City> findByName(String name) {
        return cityRepo.findAllByNameContaining(name);
    }
}
