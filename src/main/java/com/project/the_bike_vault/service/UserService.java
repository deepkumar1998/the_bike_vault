package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.User;
import com.project.the_bike_vault.repository.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public User addUser(User user){
        return userRepository.save(user);
    }

    public User finById(int id){
        return userRepository.findById(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public void delete(int id){
        userRepository.deleteById(id);
    }

    public void update(User user, int id){
        user.setId(id);
        userRepository.save(user);
    }

}
