package com.example.SpringJDBCEx.repository;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }



    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }




    public void save(Student s){
        String sql ="insert into student (rollNo,name,marks) values(?,?,?)";

        int rows = jdbcTemplate.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rows + "  effected");
    }




//    RowMapper = A converter that takes one row from the DB table and turns it into one Java object.





    public List<Student> findAll() {

        String sql = "select * from student";
        RowMapper<Student> studentRowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollNo"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;
            }
        };
       return jdbcTemplate.query(sql,studentRowMapper);

       //return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}









//App starts → Spring Boot looks for schema.sql → creates student table.
//
//Then it runs data.sql → inserts 101, 102, 103 students.
//
//Now when your repository calls findAll(), you’ll immediately get a list of those students.