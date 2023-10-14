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

import com.project.the_bike_vault.model.EmployeeType;
import com.project.the_bike_vault.service.EmployeeTypeService;
@RestController
@RequestMapping("/employeeType")
public class EmployeeTypeController {
    @Autowired
    private EmployeeTypeService employeeTypeService;

    @PostMapping("/add")
    public EmployeeType add(@RequestBody EmployeeType employeeType){
       return employeeTypeService.addEmployeeType(employeeType);
    }

    @GetMapping("/view")
    public List<EmployeeType> getAll(){
        return employeeTypeService.findAll();
    }
    @GetMapping("/view/{id}")
    public EmployeeType getById(@PathVariable int id){
        return employeeTypeService.finById(id);
    }
    @PutMapping("/update/{id}")
    public EmployeeType update(@RequestBody EmployeeType employeeType, @PathVariable int id){
        employeeTypeService.update(employeeType, id);
        return employeeType;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        employeeTypeService.delete(id);
        return id+" Deleted Successfully";
    }

}
