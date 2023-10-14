package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.VehicleHire;

public interface VehicleHireRepository extends JpaRepository<VehicleHire,Integer>{
    VehicleHire findById(int id);
}
