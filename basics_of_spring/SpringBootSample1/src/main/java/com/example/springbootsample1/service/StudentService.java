package com.example.springbootsample1.service;

import com.example.springbootsample1.model.Student;
import com.example.springbootsample1.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void addStudent(Student student){
        System.out.println("in service layer");

        if(checkStudent(student))
            studentRepo.saveStudentInDB(student);
    }

    boolean checkStudent(Student student){
        return true;
    }

}
