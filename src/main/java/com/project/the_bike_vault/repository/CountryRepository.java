package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.Country;




public interface CountryRepository extends JpaRepository<Country, Integer> {

    Country findById(int id);
    
}
