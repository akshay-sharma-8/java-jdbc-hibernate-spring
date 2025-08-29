package com.example;


import java.util.*;
import jakarta.persistence.*;

@Entity
public class Alien {

    @Id
    private int id;
    private String name;
    private String tech;


//    @OneToMany(mappedBy = "alien") // it is help in without creating a new saprate tabe of both two table to store key values
//    private List<Laptop> laptop;


//
//    Lazy Fetching → Data comes only when you ask for it.
//
//            Example: You take a plate from the kitchen only when you want to eat.
//
//    Saves time & memory if you don’t need it.
//
//    Eager Fetching → Data comes immediately with the main object.
//
//            Example: You take all the plates from the kitchen even if you only want one.
//
//    Good if you always need the related data.
    @OneToMany(fetch = FetchType.EAGER) // default it was lazy
    private List<Laptop> laptop;

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
