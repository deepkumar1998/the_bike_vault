package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.Location;
import com.project.the_bike_vault.repository.LocationRepository;
@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;
    
    public List<Location> addLocation(){
        return locationRepository.findAll();
    }

    public Location finById(int id){
        return locationRepository.findById(id);
    }

    public List<Location> findAll(){
        return locationRepository.findAll();
    }

    public void delete(int id){
        locationRepository.deleteById(id);
    }

    public void update(Location location, int id){
        location.setId(id);
        locationRepository.save(location);
    }

}
