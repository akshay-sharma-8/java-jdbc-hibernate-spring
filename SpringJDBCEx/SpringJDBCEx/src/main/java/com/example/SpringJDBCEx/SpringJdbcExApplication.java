package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);



        Student student = context.getBean("student", Student.class);
//        student.setName("Ram");
//        student.setRollNo(105);
//        student.setMarks(100);



        StudentService service = context.getBean(StudentService.class);

        service.addStudent(student);

        List<Student> students = service.getStudents();
        System.out.println(students);
	}

}
