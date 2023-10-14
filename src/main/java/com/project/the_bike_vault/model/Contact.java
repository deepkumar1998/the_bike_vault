package com.project.the_bike_vault.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String mobile;
    private String remarks;
    
    @ManyToOne
    @JoinColumn(name="countryid", insertable = false, updatable = false)
    private Country country;
    private  Integer countryid;
    
    @ManyToOne
    @JoinColumn(name = "stateid", insertable=false, updatable = false)
    private State state;
    private Integer stateid;
    private String details;
    
}
