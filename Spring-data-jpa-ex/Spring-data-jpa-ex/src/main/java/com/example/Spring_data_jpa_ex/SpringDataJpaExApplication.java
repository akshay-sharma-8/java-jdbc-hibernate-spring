package com.example.Spring_data_jpa_ex;

import com.example.Spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);
        Student s4 = context.getBean(Student.class);


//        s1.setRollNo(1);
//        s1.setName("Alice");
//        s1.setMarks(90);
//
//        s2.setRollNo(2);
//        s2.setName("Bob");
//        s2.setMarks(85);
//
//        s3.setRollNo(3);
//        s3.setName("Charlie");
//        s3.setMarks(95);
//
           s4.setRollNo(4);
           s4.setName("Charlie");
           s4.setMarks(89);

//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);
//          repo.save(s4);


//        System.out.println(repo.findAll());


//        Optional<Student> s = repo.findById(8);
//        // optional mean have a value or it will hendle null value
//        System.out.println(s.orElse(new Student()));

//        System.out.println(repo.findbyName("Charlie"));


//        System.out.println(repo.findByMarksGreaterThan(90));


         repo.delete(s4);

	}

}
