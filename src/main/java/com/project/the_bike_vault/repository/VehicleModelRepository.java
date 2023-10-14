package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.VehicleModel;

public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer>{
    VehicleModel findById(int id);   
}
