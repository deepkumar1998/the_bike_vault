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

import com.project.the_bike_vault.model.VehicleModel;
import com.project.the_bike_vault.service.VehicleModelService;

@RestController
@RequestMapping("/vehicleModel")
public class VehicleModelController {
    @Autowired
   private VehicleModelService vehicleModelService;

   @GetMapping("/view")
   public List<VehicleModel> getAllModel(){
    return vehicleModelService.findAll();
   }

   @GetMapping("/view/{id}")
   public VehicleModel getById(@PathVariable int id){
    return vehicleModelService.finById(id);
   }

   @PostMapping("/add")
   public VehicleModel addModel(@RequestBody VehicleModel vehicleModel){
    vehicleModelService.addVehicleModel(vehicleModel);
    return vehicleModel;
   }

   @PutMapping("/update/{id}")
   public VehicleModel updatVehicleModel(@RequestBody VehicleModel vehicleModel, @PathVariable int id){
    vehicleModelService.update(vehicleModel, id);
    return vehicleModel;
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteModel(@PathVariable int id){
    vehicleModelService.delete(id);
    return id+" Deleted Successfully";
   }

}
