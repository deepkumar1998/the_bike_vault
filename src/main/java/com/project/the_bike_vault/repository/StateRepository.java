package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.State;



public interface StateRepository extends JpaRepository<State, Integer> {

    State findById(int id);
    
}
