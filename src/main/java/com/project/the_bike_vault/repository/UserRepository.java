package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    User findById(int id);
}
