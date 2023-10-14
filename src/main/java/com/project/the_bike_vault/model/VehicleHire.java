package com.project.the_bike_vault.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
public class VehicleHire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "vehicleid",insertable = false,updatable = false)
    private Vehicle vehicle;
    private Integer vehicleid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOut;

    private String timeOut;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateIn;

    private String timeIn;

    @ManyToOne
    @JoinColumn(name = "clientid", insertable = false,updatable = false)
    private Client client;
    private Integer clientid;

    @ManyToOne
    @JoinColumn(name="locationid",insertable = false,updatable = false)
    private Location location;
    private Integer locationid;

    private String price;
    private String remarks;


}
