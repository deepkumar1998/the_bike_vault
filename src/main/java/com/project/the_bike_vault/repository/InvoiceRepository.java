package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer>{
    Invoice findById(int id);
    
}
