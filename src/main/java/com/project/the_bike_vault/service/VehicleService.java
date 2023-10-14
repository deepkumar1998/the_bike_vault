package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.Vehicle;
import com.project.the_bike_vault.repository.VehicleRepository;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    
    public Vehicle addVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public Vehicle finById(int id){
        return vehicleRepository.findById(id);
    }

    public List<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }

    public void delete(int id){
        vehicleRepository.deleteById(id);
    }

    public void update(Vehicle vehicle, int id){
        vehicle.setId(id);
        vehicleRepository.save(vehicle);
    }

}
