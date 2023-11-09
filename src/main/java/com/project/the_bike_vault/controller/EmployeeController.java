package com.project.the_bike_vault.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.Employee;
import com.project.the_bike_vault.service.EmployeeService;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
   private EmployeeService employeeService;

    @PostMapping("/add")
   public Employee add(@RequestBody Employee employee){
       return employeeService.addEmployee(employee);
   }

    @GetMapping("/view")
   public List<Employee> getAll(){
    return employeeService.findAll();
   }
   @GetMapping("/view/{id}")
   public Employee getById(@PathVariable int id){
    return employeeService.findById(id);
   }
   @PutMapping("/update/{id}")
   public Employee update(@RequestBody Employee employee, @PathVariable int id){
    employeeService.updateEmployee(employee, id);
    return employee;
   }
   @DeleteMapping("/delete/{id}")
   public String delete(@PathVariable int id){
    employeeService.deleteEmployee(id);
    return id+" Deleted Successfully";
   }



}
