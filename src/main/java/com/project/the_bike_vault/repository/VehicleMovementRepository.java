package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.VehicleMovement;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement,Integer>{
    VehicleMovement findById(int id);
}
