package com.example;


import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Object");
    }



    @Override
    public void compile(){
        System.out.println("Compiling using laptop");
    }
}

