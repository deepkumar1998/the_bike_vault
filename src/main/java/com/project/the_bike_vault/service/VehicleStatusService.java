package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.VehicleStatus;
import com.project.the_bike_vault.repository.VehicleStatusRepository;
@Service
public class VehicleStatusService {
    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;
    
    

    public VehicleStatus finById(int id){
        return vehicleStatusRepository.findById(id);
    }

    public List<VehicleStatus> findAll(){
        return vehicleStatusRepository.findAll();
    }

    public void delete(int id){
        vehicleStatusRepository.deleteById(id);
    }

    public void update(VehicleStatus vehicleStatus, int id){
        vehicleStatus.setId(id);
        vehicleStatusRepository.save(vehicleStatus);
    }

    public VehicleStatus addVehicleStatus(VehicleStatus vehicleStatus) {
        return vehicleStatusRepository.save(vehicleStatus);
    }

}
