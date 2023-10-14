package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.VehicleType;

public interface VehicleTypeRepository extends JpaRepository<VehicleType,Integer>{
    VehicleType findById(int id);
}
