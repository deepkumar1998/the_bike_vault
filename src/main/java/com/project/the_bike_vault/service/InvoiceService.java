package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.Invoice;
import com.project.the_bike_vault.repository.InvoiceRepository;
@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    
    public Invoice addInvoice(Invoice invoice){
        return invoiceRepository.save(invoice);
    }

    public Invoice finById(int id){
        return invoiceRepository.findById(id);
    }

    public List<Invoice> findAll(){
        return invoiceRepository.findAll();
    }

    public void delete(int id){
        invoiceRepository.deleteById(id);
    }

    public void update(Invoice invoice, int id){
        invoice.setId(id);
        invoiceRepository.save(invoice);
    }

}
