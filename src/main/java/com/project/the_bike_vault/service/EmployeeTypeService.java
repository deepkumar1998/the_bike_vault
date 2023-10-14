package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.EmployeeType;
import com.project.the_bike_vault.repository.EmployeeTypeRepository;
@Service
public class EmployeeTypeService {
    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    public EmployeeType addEmployeeType(EmployeeType employeeType){
        return employeeTypeRepository.save(employeeType);
    }

    public EmployeeType finById(int id){
        return employeeTypeRepository.findById(id);
    }

    public List<EmployeeType> findAll(){
        return employeeTypeRepository.findAll();
    }

    public void delete(int id){
        employeeTypeRepository.deleteById(id);
    }

    public void update(EmployeeType employeeType, int id){
        employeeType.setId(id);
        employeeTypeRepository.save(employeeType);
    }
}
