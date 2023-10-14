package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
    Contact findById(int id);
}
