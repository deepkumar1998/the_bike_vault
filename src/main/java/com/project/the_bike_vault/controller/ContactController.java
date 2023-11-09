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

import com.project.the_bike_vault.model.Contact;
import com.project.the_bike_vault.service.ContactService;
@RestController
@CrossOrigin(origins = "http://localhost:4200/") 
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/add")
    public Contact add(@RequestBody Contact contact){
       return contactService.addNew(contact);
    }
    @GetMapping("/view")
    public List<Contact> getAll(){
        return contactService.findAll();
    }
    @GetMapping("/view/{id}")
    public Contact getById(@PathVariable int id){
        return contactService.findByid(id);

    }
    @PutMapping("/update/{id}")
    public Contact update(@RequestBody Contact contact, @PathVariable int id){
        contactService.updateContact(contact, id);
        return contact;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        contactService.delete(id);
        return id+" Deleted Successfully";
        
    }


    
    
}
