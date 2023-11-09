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

import com.project.the_bike_vault.model.Invoice;
import com.project.the_bike_vault.service.InvoiceService;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
   private InvoiceService invoiceService;

    @PostMapping("/add")
   public Invoice add(Invoice invoice){
    return invoiceService.addInvoice(invoice);
   }
   @GetMapping("/view")
   public List<Invoice> getAll(){
    return invoiceService.findAll();
   }
   @GetMapping("/view/{id}")
   public Invoice getById(@PathVariable int id){
    return invoiceService.finById(id);
   }
   @PutMapping("/view/{id}")
   public Invoice update(@RequestBody Invoice invoice,@PathVariable int id){
    invoiceService.update(invoice, id);
    return invoice;
   }
   @DeleteMapping("/delete/{id}")
   public String delete(@PathVariable int id){
    invoiceService.delete(id);
    return id+" Deleted Successfully";
   }


}
