package com.example;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop Constrector");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
