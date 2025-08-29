package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {


















        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // spring container and in this ClassPathXmlApplicationContext(congfiguration for the container)

//      Alien obj = (Alien) context.getBean("alien"); // it will  give the object
//      obj.code(); // with that object we can do whatever we want
//


//        Alien obj1 = (Alien) context.getBean("alien");
//        System.out.println(obj1.age);
//
//

//        Alien obj = (Alien) context.getBean("alien");
//
//        System.out.println(obj.getAge());


        Alien obj =  context.getBean("alien" , Alien.class);
        System.out.println(obj.getAge());
        obj.code();





    }
}
