package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.Supplier;



public interface SupplierRepository extends JpaRepository<Supplier,Integer>{
    Supplier findById(int id);
}
