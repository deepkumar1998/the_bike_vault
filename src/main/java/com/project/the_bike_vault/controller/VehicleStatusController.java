package com.project.the_bike_vault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.VehicleStatus;
import com.project.the_bike_vault.service.VehicleStatusService;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/vehicleStatus")
public class VehicleStatusController {
    @Autowired
    private VehicleStatusService vehicleStatusService;

    @PostMapping("/addStatus")
    public VehicleStatus addStatus(@RequestBody VehicleStatus vehicleStatus){
        return vehicleStatusService.addVehicleStatus(vehicleStatus);
    }

    @GetMapping("/view")
    public  List<VehicleStatus> getAllStatus(){

        return vehicleStatusService.findAll();
        
    }

    @GetMapping("/view/{id}")
    public VehicleStatus getById(@PathVariable int id){
        return vehicleStatusService.finById(id);
    }

    @PutMapping("/view/{id}")
    public VehicleStatus updateStatus(@RequestBody VehicleStatus vehicleStatus, @PathVariable ("id") int id){
        vehicleStatusService.update(vehicleStatus, id);
        return vehicleStatus;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStatus(@PathVariable ("id") int id){
        vehicleStatusService.delete(id);
        return id+" Deleted Successfully";
    }





    
}
