package com.project.the_bike_vault.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class VehicleMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "vehicleid",insertable = false,updatable = false)
    private Vehicle vehicle;
    private Integer vehicleid;

    @ManyToOne
    @JoinColumn(name = "locationid1",insertable = false,updatable = false)
    private Location location1;
    private Integer locationid1;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date1;

    @ManyToOne
    @JoinColumn(name = "locationid2",insertable = false,updatable = false)
    private Location location2;
    private Integer locationid2;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date2;

    private String remarks;


    
}
