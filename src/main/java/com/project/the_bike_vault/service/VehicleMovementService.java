package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.VehicleMovement;
import com.project.the_bike_vault.repository.VehicleMovementRepository;

@Service
public class VehicleMovementService {
    @Autowired
    private VehicleMovementRepository vehicleMovementRepository;

    public void addVehicleMovement(VehicleMovement vehicleMovement){
        vehicleMovementRepository.save(vehicleMovement);
        
    }

    public VehicleMovement finById(int id){
        return vehicleMovementRepository.findById(id);
    }

    public List<VehicleMovement> findAll(){
        return vehicleMovementRepository.findAll();
    }

    public void delete(int id){
        vehicleMovementRepository.deleteById(id);
    }

    public void update(VehicleMovement vehicleMovement, int id){
        vehicleMovement.setId(id);
        vehicleMovementRepository.save(vehicleMovement);
    }

}
