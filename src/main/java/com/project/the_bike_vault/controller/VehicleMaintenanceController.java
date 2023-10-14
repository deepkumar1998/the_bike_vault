package com.project.the_bike_vault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.VehicleMaintenance;
import com.project.the_bike_vault.service.VehicleMaintenanceService;


@RestController
public class VehicleMaintenanceController {
    @Autowired
    private VehicleMaintenanceService vehicleMaintenanceService;

@GetMapping("/view")
   public List<VehicleMaintenance> getAll(){
    return vehicleMaintenanceService.findAll();
   }

   @GetMapping("/view/{id}")
   public VehicleMaintenance getById(@PathVariable int id){
    return vehicleMaintenanceService.finById(id);
   }

   @PostMapping("/add")
   public VehicleMaintenance addModel(@RequestBody VehicleMaintenance vehicleMaintenance){
    vehicleMaintenanceService.addVehicleMaintenance(vehicleMaintenance);
    return vehicleMaintenance;
   }

   @PutMapping("/update/{id}")
   public VehicleMaintenance updateVehicleModel(@RequestBody VehicleMaintenance vehicleMaintenance, @PathVariable int id){
    vehicleMaintenanceService.update(vehicleMaintenance, id);
    return vehicleMaintenance;
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteModel(@PathVariable int id){
    vehicleMaintenanceService.delete(id);
    return id+" Deleted Successfully";
   }

}
