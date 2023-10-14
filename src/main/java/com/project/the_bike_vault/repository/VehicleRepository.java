package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{
    Vehicle findById(int id);
}
