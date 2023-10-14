package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.Employee;
import com.project.the_bike_vault.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(int id){
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }
    
    public void updateEmployee(Employee employee,int id){
        employee.setId(id);
        employeeRepository.save(employee);
    }
}
