package com.project.the_bike_vault.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.the_bike_vault.model.State;
import com.project.the_bike_vault.repository.StateRepository;

@Service
public class StateService {
    @Autowired
    StateRepository stateRepository;
    //find all
    public List<State> findAll(){
        return stateRepository.findAll();
        
    }

    //find by id
    public State findById(int id){
        return stateRepository.findById(id);
    }

    //delete by id
    public void delete(int id){
        stateRepository.deleteById(id);
    }

    //insert new state
    public void addState(State state){
        stateRepository.save(state);
    }

    //Update state
    public State update(State state, int id){
        state.setId(id);
        stateRepository.save(state);
        return state;
    }



}
