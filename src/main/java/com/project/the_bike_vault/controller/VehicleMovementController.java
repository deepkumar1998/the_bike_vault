package com.project.the_bike_vault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.VehicleMovement;
import com.project.the_bike_vault.service.VehicleMovementService;

@RestController
@RequestMapping("/vehicleMovement")
public class VehicleMovementController {

    @Autowired
    private VehicleMovementService vehicleMovementService;

    @PostMapping("/addMovement")
    public VehicleMovement addMovement(VehicleMovement vehicleMovement){
        vehicleMovementService.addVehicleMovement(vehicleMovement);
        return vehicleMovement;
    }

    @GetMapping("/getMovement")
    public List<VehicleMovement> getAll(){
        return vehicleMovementService.findAll();
    }

    @GetMapping("/getMovement/{id}")
    public VehicleMovement getById(@PathVariable int id){
        return vehicleMovementService.finById(id);
    }

    @PutMapping("/updateMovement/{id}")
    public VehicleMovement updateVehicleMovement(@RequestBody VehicleMovement vehicleMovement,@PathVariable int id){
        vehicleMovementService.update(vehicleMovement, id);
        return vehicleMovement;
    }
    @DeleteMapping("/deleteMovement/{id}")
    public String deleteMovement(@PathVariable int id){
        vehicleMovementService.delete(id);
        return id+" Deleted Successfully";
    }


    
}
