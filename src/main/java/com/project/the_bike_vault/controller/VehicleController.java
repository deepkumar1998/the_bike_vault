package com.project.the_bike_vault.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.Vehicle;
import com.project.the_bike_vault.service.VehicleService;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/vehicle")
public class VehicleController {

    private VehicleService vehicleService;
    @GetMapping("/view")
   public List<Vehicle> getAll(){
    return vehicleService.findAll();
   }

   @GetMapping("/view/{id}")
   public Vehicle getById(@PathVariable int id){
    return vehicleService.finById(id);
   }

   @PostMapping("/add")
   public Vehicle addModel(@RequestBody Vehicle vehicle){
    vehicleService.addVehicle(vehicle);
    return vehicle;
   }

   @PutMapping("/update/{id}")
   public Vehicle updatVehicleModel(@RequestBody Vehicle vehicle, @PathVariable int id){
    vehicleService.update(vehicle, id);
    return vehicle;
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteModel(@PathVariable int id){
    vehicleService.delete(id);
    return id+" Deleted Successfully";
   }

}
