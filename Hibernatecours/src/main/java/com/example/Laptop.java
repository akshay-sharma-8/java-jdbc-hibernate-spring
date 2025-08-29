package com.example;


//@Embeddable
// in Java is used to mark a class whose fields are stored as part of another entity’s table,
// not in a separate table

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {

    private String Brand;
    private String Model;
    private int Ram;

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
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Ram=" + Ram +
                '}';
    }
}
