package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    Employee findById(int id);
}
