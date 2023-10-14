package com.project.the_bike_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.the_bike_vault.model.JobTitle;

public interface JobTitleRepository extends JpaRepository<JobTitle,Integer> {
    JobTitle findById(int id);
}
