package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

//An entity is a Java class mapped to a DB table.
// table name is default as your class name
//Every field = a column.
//
//Every object = a row.
//
//Annotated with @Entity, @Id, etc.

public class Students {

    @Id // is primary key
    private int sid; // this is id;

    private String name;
    private  int marks;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
