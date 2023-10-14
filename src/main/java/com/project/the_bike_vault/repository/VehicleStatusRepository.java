package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.VehicleStatus;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Integer>{
    VehicleStatus findById(int id);
}
