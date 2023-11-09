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

import com.project.the_bike_vault.model.Supplier;
import com.project.the_bike_vault.service.SupplierService;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/add")
    public Supplier add(@RequestBody Supplier supplier){
        return supplierService.addSupplier(supplier);
    }
    @GetMapping("/view")
    public List<Supplier> getAll(){
        return supplierService.findAll();
    }

    @GetMapping("/view/{id}")
    public Supplier getById(@PathVariable int id){
        return supplierService.finById(id);
    }
    @PutMapping("/update/{id}")
    public Supplier update (@RequestBody Supplier supplier, @PathVariable int id){
        supplierService.update(supplier, id);
        return supplier;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        supplierService.delete(id);
        return id+" Deleted Successfully";
    }








}
