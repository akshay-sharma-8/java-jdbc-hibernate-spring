package com.example.Spring_data_jpa_ex;

import com.example.Spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;






@Repository
interface StudentRepo extends JpaRepository<Student,Integer> {
    //JpaRepository<Type of class, Type of primary key>
//    It extends JpaRepository,
//    which is a Spring Data JPA interface that provides ready-made methods
//     for database operations.


  //  @Query("select s from Student s where s.name= ?1")
    List<Student> findByName(String name);
    List<Student> findByMarksGreaterThan(int marks);




}




//JPA allows us to work with Java objects instead
//of writing SQL queries for every database operation.
//It handles CRUD operations automatically.
