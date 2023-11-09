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

import com.project.the_bike_vault.model.VehicleMake;
import com.project.the_bike_vault.service.VehicleMakeService;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/vehicleMake")
public class VehicleMakeController {
    @Autowired
    private VehicleMakeService vehicleMakeService;
    
    @GetMapping("/view")
   public List<VehicleMake> getAll(){
    return vehicleMakeService.findAll();
   }

   @GetMapping("/view/{id}")
   public VehicleMake getById(@PathVariable int id){
    return vehicleMakeService.finById(id);
   }

   @PostMapping("/add")
   public VehicleMake addModel(@RequestBody VehicleMake vehicleMake){
    vehicleMakeService.addVehicleMake(vehicleMake);
    return vehicleMake;
   }

   @PutMapping("/update/{id}")
   public VehicleMake updatVehicleModel(@RequestBody VehicleMake vehicleMake, @PathVariable int id){
    vehicleMakeService.update(vehicleMake, id);
    return vehicleMake;
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteModel(@PathVariable int id){
    vehicleMakeService.delete(id);
    return id+" Deleted Successfully";
   }

    
}
