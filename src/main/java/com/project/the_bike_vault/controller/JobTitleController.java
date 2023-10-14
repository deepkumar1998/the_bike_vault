package com.project.the_bike_vault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.JobTitle;
import com.project.the_bike_vault.service.JobTitleService;
@RestController
@RequestMapping("/jobTitle")
public class JobTitleController {
    @Autowired
   private JobTitleService jobTitleService;

    @PostMapping("/add")
    public JobTitle add(@RequestBody JobTitle jobTitle){
        return jobTitleService.addJobTitle(jobTitle);
   }
    @GetMapping("/view")
    public List<JobTitle> getAll(){
        return jobTitleService.findAll();
    }
    @GetMapping("/view/{id}")
    public JobTitle getById(@PathVariable int id){
        return jobTitleService.finById(id);
    }
    @PutMapping("/update/{id}")
    public JobTitle update(@RequestBody JobTitle jobTitle, @PathVariable int id){
        jobTitleService.update(jobTitle, id);
        return jobTitle;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        jobTitleService.delete(id);

        return id+" Deleted Successfully";
    }


}
