package com.project.the_bike_vault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.Country;
import com.project.the_bike_vault.service.CountryService;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @PostMapping("/add")
    public Country add(@RequestBody Country country){
        return countryService.addNew(country);
    }

    @GetMapping("/view")
    public List<Country> getAll(){
       return countryService.findAll();
    }

    @GetMapping("/view/{id}")
    public Country getById(@PathVariable int id){
        return countryService.findById(id);
    }
    @PutMapping("/update/id")
    public Country update(@RequestBody Country country, @PathVariable int id){
        countryService.updateCountry(country, id);
        return country;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        countryService.delete(id);
        return id+" Deleted Successfully";
    }



}
