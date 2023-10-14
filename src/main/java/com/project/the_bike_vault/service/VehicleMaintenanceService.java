package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.VehicleMaintenance;
import com.project.the_bike_vault.repository.VehicleMaintenanceRepository;
@Service
public class VehicleMaintenanceService {
    @Autowired
    private VehicleMaintenanceRepository vehicleMaintenanceRepository;
    
    public VehicleMaintenance addVehicleMaintenance(VehicleMaintenance vehicleMaintenance){
        return vehicleMaintenanceRepository.save(vehicleMaintenance);
    }

    public VehicleMaintenance finById(int id){
        return vehicleMaintenanceRepository.findById(id);
    }

    public List<VehicleMaintenance> findAll(){
        return vehicleMaintenanceRepository.findAll();
    }

    public void delete(int id){
        vehicleMaintenanceRepository.deleteById(id);
    }

    public void update(VehicleMaintenance vehicleMaintenance, int id){
        vehicleMaintenance.setId(id);
        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }

}
