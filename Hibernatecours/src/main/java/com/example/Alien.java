package com.example;

import jakarta.persistence.*;

@Entity

@Table(name="Alien_001")
public class Alien {

    @Id
    private int id;

    @Column(name="username")
    private String name;

    @Transient // use in class only and object not store data in database
    private String tech;

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
                '}';
    }
}
