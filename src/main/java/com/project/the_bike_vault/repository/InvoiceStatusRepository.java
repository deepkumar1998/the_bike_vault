package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.InvoiceStatus;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Integer>{
    InvoiceStatus findById(int id);
}
