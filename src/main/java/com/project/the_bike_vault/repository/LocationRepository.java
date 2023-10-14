package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.Location;

public interface LocationRepository extends JpaRepository<Location,Integer> {
    Location findById(int id);
}
