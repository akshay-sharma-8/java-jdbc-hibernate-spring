package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfi.class);

//        Desktop desktop = context.getBean("desktop",Desktop.class);
//        desktop.compile();



//        Desktop desktop1 = context.getBean("desktop",Desktop.class);
//        desktop1.compile();

        Alien alien = context.getBean(Alien.class);
        alien.getAge();
        alien.code();




    }
}
