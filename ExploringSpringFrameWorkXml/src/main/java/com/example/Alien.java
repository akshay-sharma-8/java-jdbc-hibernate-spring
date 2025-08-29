package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.beans.ConstructorProperties;


public class Alien {

    private int age;
    
//    private Laptop lap1;

    private Computer com;


    public Alien(){
        System.out.println("Object Created");
    }

//    @ConstructorProperties({"age","lap1"})
//    public Alien(int age, Laptop lap1) {
//        this.age = age;
//        this.lap1 = lap1;
//    }


    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //  System.out.println("Call setAge");
        this.age = age;
    }

//    public Laptop getLap1() {
//        return lap1;
//    }
//
//    public void setLap1(Laptop lap1) {
//        this.lap1 = lap1;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("coding...");
//        lap1.compile();
        com.compile();
        
    }
}
