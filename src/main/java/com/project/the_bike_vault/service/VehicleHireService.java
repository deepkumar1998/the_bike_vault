package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.VehicleHire;
import com.project.the_bike_vault.repository.VehicleHireRepository;
@Service
public class VehicleHireService {
    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    public VehicleHire addVehicleHire(VehicleHire vehicleHire){
        return vehicleHireRepository.save(vehicleHire);
    }

    public VehicleHire finById(int id){
        return vehicleHireRepository.findById(id);
    }

    public List<VehicleHire> findAll(){
        return vehicleHireRepository.findAll();
    }

    public void delete(int id){
        vehicleHireRepository.deleteById(id);
    }

    public void update(VehicleHire vehicleHire, int id){
        vehicleHire.setId(id);
        vehicleHireRepository.save(vehicleHire);
    }

}
