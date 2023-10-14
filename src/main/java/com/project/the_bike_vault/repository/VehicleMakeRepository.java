package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.VehicleMake;

public interface VehicleMakeRepository extends JpaRepository<VehicleMake,Integer>{
    VehicleMake findById(int id);
}
