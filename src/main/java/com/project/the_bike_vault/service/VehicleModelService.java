package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.the_bike_vault.model.VehicleModel;
import com.project.the_bike_vault.repository.VehicleModelRepository;

@Service
public class VehicleModelService {
    @Autowired
    private VehicleModelRepository vehicleModelRepository;
    
    public VehicleModel addVehicleModel(VehicleModel vehicleModel){
        vehicleModelRepository.save(vehicleModel);
        return vehicleModel;
    }

    public VehicleModel finById(int id){
        return vehicleModelRepository.findById(id);
    }

    public List<VehicleModel> findAll(){
        return vehicleModelRepository.findAll();
    }

    public void delete(int id){
        vehicleModelRepository.deleteById(id);
    }

    public void update(VehicleModel vehicleModel, int id){
        vehicleModel.setId(id);
        vehicleModelRepository.save(vehicleModel);
    }

    

}
