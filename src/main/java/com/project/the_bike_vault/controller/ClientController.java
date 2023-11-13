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

import com.project.the_bike_vault.model.Client;
import com.project.the_bike_vault.service.ClientService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    @PostMapping("/add")
    public Client add(@RequestBody Client client){
        return clientService.addNew(client);
        
    }

    @GetMapping("/view")
    public List<Client> getAll(){
        return clientService.findAll();

    }
    @GetMapping("/view/{id}")
    public Client getById(@PathVariable int id){
        return clientService.findById(id);
    }
    @PutMapping("/update/{id}")
    public Client update(@RequestBody Client client, @PathVariable int id){
        clientService.update(client,id);
        return client;
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        clientService.delete(id);
        
    }
}