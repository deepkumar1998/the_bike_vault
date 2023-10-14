package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.EmployeeType;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Integer> {
    EmployeeType findById(int id);
}
