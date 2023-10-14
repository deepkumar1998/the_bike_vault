package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.Country;
import com.project.the_bike_vault.repository.CountryRepository;



@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;
    //find all
    public List<Country> findAll(){
        return countryRepository.findAll();
        
    }

    //find by id
    public Country findById(int id){
        return countryRepository.findById(id);
    }

    //delete by id
    public void delete(int id){
        countryRepository.deleteById(id);
    }

    //insert new state
    public Country addNew(Country country){
        return countryRepository.save(country);
    }

    // update Country
    public void updateCountry(Country country,int id){
        country.setId(id);
        countryRepository.save(country);
    }



}
