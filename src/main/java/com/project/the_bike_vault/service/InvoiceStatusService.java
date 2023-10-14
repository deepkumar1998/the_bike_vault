package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.InvoiceStatus;
import com.project.the_bike_vault.repository.InvoiceStatusRepository;
@Service
public class InvoiceStatusService {
    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    public InvoiceStatus addInvoiceStatus(InvoiceStatus invoiceStatus){
        return invoiceStatusRepository.save(invoiceStatus);
    }

    public InvoiceStatus finById(int id){
        return invoiceStatusRepository.findById(id);
    }

    public List<InvoiceStatus> findAll(){
        return invoiceStatusRepository.findAll();
    }

    public void delete(int id){
        invoiceStatusRepository.deleteById(id);
    }

    public void update(InvoiceStatus invoiceStatus, int id){
        invoiceStatus.setId(id);
        invoiceStatusRepository.save(invoiceStatus);
    }

}
