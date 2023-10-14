package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.Supplier;
import com.project.the_bike_vault.repository.SupplierRepository;
@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    
    public Supplier addSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }

    public Supplier finById(int id){
        return supplierRepository.findById(id);
    }

    public List<Supplier> findAll(){
        return supplierRepository.findAll();
    }

    public void delete(int id){
        supplierRepository.deleteById(id);
    }

    public void update(Supplier supplier, int id){
        supplier.setId(id);
        supplierRepository.save(supplier);
    }

}
