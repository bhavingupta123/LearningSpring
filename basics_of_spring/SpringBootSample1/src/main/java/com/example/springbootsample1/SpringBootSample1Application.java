package com.example.springbootsample1;

import com.example.springbootsample1.model.Student;
import com.example.springbootsample1.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootSample1Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootSample1Application.class, args);

        StudentService studentService = context.getBean(StudentService.class);
        Student student = new Student();
        studentService.addStudent(student);
    }

}
