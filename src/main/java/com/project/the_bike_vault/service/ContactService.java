package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.Contact;
import com.project.the_bike_vault.repository.ContactRepository;
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact addNew(Contact contact){
       return contactRepository.save(contact);
    }

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public Contact findByid(int id){
        return contactRepository.findById(id);
    }

    public void updateContact(Contact contact, int id){
        contact.setId(id);
        contactRepository.save(contact);
    }

    public void delete(int id){
        contactRepository.deleteById(id);
    }




    
}
