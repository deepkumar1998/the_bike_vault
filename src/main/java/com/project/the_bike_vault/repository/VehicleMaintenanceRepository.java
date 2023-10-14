package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.VehicleMaintenance;

public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance,Integer> {
    VehicleMaintenance findById(int id);
}
