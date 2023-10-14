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

import com.project.the_bike_vault.model.VehicleType;
import com.project.the_bike_vault.service.VehicleTypeService;
@RestController
@RequestMapping("/vehicleType")
public class VehicleTypeController {
    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping("/type")
    public  List<VehicleType> findAll(){
        return vehicleTypeService.findAll();

    }
    @GetMapping("/type/{id}")
    public VehicleType findById(@PathVariable ("id")int id){
        return vehicleTypeService.finById(id);
    }

    @PostMapping("/addType")
    public VehicleType addVehicleType(@RequestBody VehicleType vehicleType){
        vehicleTypeService.addVehicleType(vehicleType);
        return vehicleType;
    }

    @PutMapping("/updateType/{id}")
    public VehicleType updateVehicleType(@RequestBody VehicleType vehicleType,@PathVariable int id){
        vehicleTypeService.update(vehicleType, id);
        return vehicleType;
    }

    @DeleteMapping("/deleteType/{id}")
    public String deleteVehicleType(@PathVariable int id){
        vehicleTypeService.delete(id);
        return id+" Deleted Successfully";
    }
}
