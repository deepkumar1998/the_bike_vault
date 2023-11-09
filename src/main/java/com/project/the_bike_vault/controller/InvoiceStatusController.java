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

import com.project.the_bike_vault.model.InvoiceStatus;
import com.project.the_bike_vault.service.InvoiceStatusService;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/invoiceStatus")
public class InvoiceStatusController {
    @Autowired
    private InvoiceStatusService invoiceStatusService;

    @PostMapping("/add")
    public InvoiceStatus add(@RequestBody InvoiceStatus invoiceStatus){
        return invoiceStatusService.addInvoiceStatus(invoiceStatus);
    }
    @GetMapping("/view")
    public List<InvoiceStatus> getAll(){
        return invoiceStatusService.findAll();
    }
    @GetMapping("/view/{id}")
    public InvoiceStatus getById(@PathVariable int id){
        return invoiceStatusService.finById(id);
    }
    @PutMapping("/update/{id}")
    public InvoiceStatus update(@RequestBody InvoiceStatus invoiceStatus, @PathVariable int id){
        invoiceStatusService.update(invoiceStatus, id);
        return invoiceStatus;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        invoiceStatusService.delete(id);

        return id+" Deleted Successfully";
    }
    
}
