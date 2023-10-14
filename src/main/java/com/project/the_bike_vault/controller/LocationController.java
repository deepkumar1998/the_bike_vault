package com.project.the_bike_vault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.Location;
import com.project.the_bike_vault.service.LocationService;
@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;

//   create
    @PostMapping("/add")
    public Location add(@RequestBody Location location){
        locationService.addLocation();
        return location;
    }

//   readall
    @GetMapping("/view")
    public List<Location> getAll(){
        return locationService.findAll();
    }
//   read
    @GetMapping("/view/{id}")
    public Location getById(@PathVariable int id){
        return locationService.finById(id);
    }
//   update
    @PutMapping("/update/{id}")
    public Location update(@RequestBody Location location,@PathVariable int id){
        locationService.update(location, id);
        return location;
    }
//   delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        locationService.delete(id);
        return id+" Deleted Successfully";

    }
}
