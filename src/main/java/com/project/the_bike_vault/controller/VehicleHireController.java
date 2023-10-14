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

import com.project.the_bike_vault.model.VehicleHire;
import com.project.the_bike_vault.service.VehicleHireService;


@RestController
@RequestMapping("/vehicleHire")
public class VehicleHireController {
    @Autowired
    private VehicleHireService vehicleHireService;
    @GetMapping("/view")
   public List<VehicleHire> getAll(){
    return vehicleHireService.findAll();
   }

   @GetMapping("/view/{id}")
   public VehicleHire getById(@PathVariable int id){
    return vehicleHireService.finById(id);
   }

   @PostMapping("/add")
   public VehicleHire addModel(@RequestBody VehicleHire vehicleHire){
    vehicleHireService.addVehicleHire(vehicleHire);
    return vehicleHire;
   }

   @PutMapping("/update/{id}")
   public VehicleHire updatVehicleModel(@RequestBody VehicleHire vehicleHire, @PathVariable int id){
    vehicleHireService.update(vehicleHire, id);
    return vehicleHire;
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteModel(@PathVariable int id){
    vehicleHireService.delete(id);
    return id+" Deleted Successfully";
   }

}
