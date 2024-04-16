package com.example.springbootwithspringjdbc1.service;

import com.example.springbootwithspringjdbc1.model.Student;
import com.example.springbootwithspringjdbc1.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student){
        System.out.println("in service layer");
        studentRepo.save(student);
    }

    public List<Student> getStudents(){
        System.out.println("in get all students method");
        return studentRepo.findAll();
    }
}
