package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.JobTitle;
import com.project.the_bike_vault.repository.JobTitleRepository;

@Service
public class JobTitleService {
    @Autowired
    private JobTitleRepository jobTitleRepository;

    
    public JobTitle addJobTitle(JobTitle jobTitle){
        return jobTitleRepository.save(jobTitle);
    }

    public JobTitle finById(int id){
        return jobTitleRepository.findById(id);
    }

    public List<JobTitle> findAll(){
        return jobTitleRepository.findAll();
    }

    public void delete(int id){
        jobTitleRepository.deleteById(id);
    }

    public void update(JobTitle jobTitle, int id){
        jobTitle.setId(id);
        jobTitleRepository.save(jobTitle);
    }

    
}
