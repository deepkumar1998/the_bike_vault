package com.project.the_bike_vault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.the_bike_vault.model.User;
import com.project.the_bike_vault.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/view")
   public List<User> getUser(){
    return userService.findAll();
   }

   @GetMapping("/view/{id}")
   public User getUserById(@PathVariable int id){
    return userService.finById(id);
   }

   @PostMapping("/add")
   public User addUser(@RequestBody User user){
    return userService.addUser(user);
   }

   @PutMapping("/update/{id}")
   public User update(@RequestBody User user,@PathVariable int id){
    userService.update(user, id);
    return user;
   }
   @DeleteMapping
   public String delete(@PathVariable int id){
    userService.delete(id);
    return id+" Deleted Successfully";
   }

   
}
