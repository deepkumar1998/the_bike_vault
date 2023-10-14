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

import com.project.the_bike_vault.model.State;
import com.project.the_bike_vault.service.StateService;
@RestController
@RequestMapping("/state")
public class StateController {

@Autowired
private StateService stateService;
//create
@PostMapping("/add")
public State add(@RequestBody State state){
    stateService.addState(state);
    return state;
}

// read all
@GetMapping("/view")
public List<State> getAll(){
    return stateService.findAll();
}

//read by id
@GetMapping("/view/{id}")
public State getById(@PathVariable int id){
    return stateService.findById(id);
}

//update
@PutMapping("/update/{id}")
public State update(@RequestBody State state,@PathVariable int id){
    return stateService.update(state, id);
}

//delete
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id){
    stateService.delete(id);
    return id+" Deleted Successfully";
}


}
