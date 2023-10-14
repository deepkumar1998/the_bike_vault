package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.Client;
import com.project.the_bike_vault.repository.ClientRepository;
@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;
    //find all Clients
    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    //Find clients by Id
    public Client findById(int id){
        return clientRepository.findById(id);
    }

    //Delete Clients by Id

    public void delete(int id){
        clientRepository.deleteById(id);
    }

    //save new client

    public Client addNew(Client client){
       return clientRepository.save(client);
    }
    //update
    public void update(Client client, int id) {
        client.setId(id);
        clientRepository.save(client);
    }

    


}
