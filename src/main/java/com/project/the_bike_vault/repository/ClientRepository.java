package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.Client;

public interface ClientRepository extends JpaRepository<Client,Integer>{
    Client findById(int id);
    
}
