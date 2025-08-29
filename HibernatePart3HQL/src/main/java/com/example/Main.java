package com.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

         Laptop lp = new Laptop();
         lp.setlID(1);
         lp.setModel("dell 3450");
         lp.setBrand("Dell");
         lp.setRam(32);

        Laptop lp1 = new Laptop();
        lp1.setlID(2);
        lp1.setModel("HP 5098");
        lp1.setBrand("HP");
        lp1.setRam(12);

        Laptop lp2 = new Laptop();
        lp2.setlID(3);
        lp2.setModel("M4");
        lp2.setBrand("Apple");
        lp2.setRam(16);

        Laptop lp3 = new Laptop();
        lp3.setlID(4);
        lp3.setModel("M2");
        lp3.setBrand("Apple");
        lp3.setRam(16);





        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//          session.persist(lp3);
//
//        transaction.commit();

//       String brand = "Apple";

//        Query query = session.createQuery("select Brand , Model from Laptop where  Brand=?1");
//        query.setParameter(1,brand);


//        List<Laptop> laptops = query.getResultList();
//        System.out.println(laptops);

//        List<Object[]> laptops = query.getResultList();
//
//        for(Object[] obj : laptops){
//            System.out.println((String)obj[0] +" "+(String)obj[1]);
//        }


         Laptop laptop = session.get(Laptop.class,2);
        System.out.println(laptop);

//        get() → When you really need the data immediately, or want to check if it exists.
//
//        load() → When you just need a reference for later use (e.g., setting foreign keys),
//        and you don’t want an immediate DB hit.

        session.close();

        Session session1 = sf.openSession();
        Laptop laptop1 = session1.get(Laptop.class,2);
        System.out.println(laptop);
        session1.close();
        sf.close();

    }
}