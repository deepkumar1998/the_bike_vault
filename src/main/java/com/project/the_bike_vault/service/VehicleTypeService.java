package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.VehicleType;
import com.project.the_bike_vault.repository.VehicleTypeRepository;

@Service
public class VehicleTypeService {
    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;
    
   
    public VehicleType finById(int id){
        return vehicleTypeRepository.findById(id);
    }

    public List<VehicleType> findAll(){
        return vehicleTypeRepository.findAll();
    }

    public void delete(int id){
        vehicleTypeRepository.deleteById(id);
    }

    public void update(VehicleType vehicleType, int id){
        vehicleType.setId(id);
        vehicleTypeRepository.save(vehicleType);
    }

    public void addVehicleType(VehicleType vehicleType) {
        vehicleTypeRepository.save(vehicleType);
    }

}
