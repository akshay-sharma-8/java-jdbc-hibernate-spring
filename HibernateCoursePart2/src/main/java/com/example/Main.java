package com.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Laptop lp = new Laptop();
        lp.setlID(1);
        lp.setBrand("Dell");
        lp.setModel("latitude 4356");
        lp.setRam(16);



        Laptop lp2 = new Laptop();
        lp2.setlID(2);
        lp2.setBrand("Asus");
        lp2.setModel("latitude 3420");
        lp2.setRam(10);


        Laptop lp3 = new Laptop();
        lp3.setlID(3);
        lp3.setBrand("HP");
        lp3.setModel("latitude 5467");
        lp3.setRam(12);



        Alien al = new Alien();
        al.setId(101);
        al.setName("Akshay");
        al.setTech("CSE");


        Alien al1 = new Alien();
        al1.setId(102);
        al1.setName("Ram");
        al1.setTech("ECE");







        al.setLaptop(Arrays.asList(lp,lp2));
        al1.setLaptop(Arrays.asList(lp3));





        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();


        session.persist(lp);
        session.persist(lp2);
        session.persist(lp3);
        session.persist(al);
        session.persist(al1);



        transaction.commit();
        session.close();

        Session session1 = sf.openSession();

        Transaction transaction1 = session1.beginTransaction();

        Alien a2 = session1.get(Alien.class,101);




        transaction1.commit();
        session1.close();

        sf.close();






    }
}