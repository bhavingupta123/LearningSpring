package com.example.springbootsample1.repository;

import com.example.springbootsample1.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {

    public void saveStudentInDB(Student student){

        System.out.println("in DAO, saved student");
    }
}
