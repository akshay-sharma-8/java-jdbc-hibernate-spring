package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



//Summary: Why use all these?

//Step	Why it's needed

//Configuration	Sets up Hibernate basics

//configure()	Loads DB and Hibernate settings

//addAnnotatedClass()	Tells Hibernate what entities to use

//buildSessionFactory()	Prepares DB connection factory

//openSession()	Opens DB connection

//beginTransaction()	Ensures safe DB operations

//save()	Saves Java object to DB

//commit()	Finalizes DB changes

//close()	Frees resources

public class Main {
    public static void main(String[] args) {

//        Students s2 = new Students();
//        s2.setSid(108);
//        s2.setName("AS");
//        s2.setMarks(98);
//        Students s1 = new Students();

//        System.out.println(s1);


//        Alien obj = new Alien();
//        obj.setName("Alien OP");
//        obj.setId(102);
//        obj.setTech("CSE");



//        Configuration cfg = new Configuration();

//        cfg.configure(); // reads hibernate.cfg.xml

//        cfg.addAnnotatedClass(Students.class); // if using annotations
//
//        SessionFactory sf = cfg.buildSessionFactory();








//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.example.Alien.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();


//      s2 = session.get(Students.class,108); // use to remove data from data base


//     Transaction transaction = session.beginTransaction();

        // save and persist both have same work to save data in database
//        session.save(s2);
//        session.persist(s2);

       // session.merge(s2); // it is use for insert  data and update data


      //  session.remove(s2); // it is used to remove data from database


//        session.persist(obj);
//       transaction.commit();

//        s1 = session.get(Students.class,103); To get data from database


//        session.close();
//        sf.close();

//        System.out.println(obj);



        Laptop lp = new Laptop();
        lp.setBrand("Dell");
        lp.setModel("Latitude 3420");
        lp.setRam(16);

        ALaptop obj = new ALaptop();
        obj.setId(101);
        obj.setName("Akshay ");
        obj.setTech("CSE");
        obj.setLaptop(lp);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(ALaptop.class)
                .configure()
                .buildSessionFactory();

         Session session = sf.openSession();

         Transaction transaction = session.beginTransaction();

          session.merge(obj);

         transaction.commit();
         session.close();
         sf.close();
        System.out.println(obj);


    }
}