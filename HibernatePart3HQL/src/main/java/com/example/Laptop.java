package com.example;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Cacheable
public class Laptop {

    @Id
    private int lID;
    private String Brand;
    private String Model;
    private int Ram;

//    @ManyToOne
//    private Alien alien;

//    @ManyToMany
//    private List<Alien> alien;

    public int getlID() {
        return lID;
    }

    public void setlID(int lID) {
        this.lID = lID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "lID=" + lID +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Ram=" + Ram +
                '}';
    }
}
