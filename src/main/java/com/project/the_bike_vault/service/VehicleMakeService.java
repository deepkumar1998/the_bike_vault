package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.VehicleMake;
import com.project.the_bike_vault.repository.VehicleMakeRepository;
@Service
public class VehicleMakeService {
    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;
    
    public VehicleMake addVehicleMake(VehicleMake vehicleMake){
        return vehicleMakeRepository.save(vehicleMake);
    }

    public VehicleMake finById(int id){
        return vehicleMakeRepository.findById(id);
    }

    public List<VehicleMake> findAll(){
        return vehicleMakeRepository.findAll();
    }

    public void delete(int id){
        vehicleMakeRepository.deleteById(id);
    }

    public void update(VehicleMake vehicleMake, int id){
        vehicleMake.setId(id);
        vehicleMakeRepository.save(vehicleMake);
    }

}
