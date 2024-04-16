package com.example.springbootwithspringjdbc1;

import com.example.springbootwithspringjdbc1.model.Student;
import com.example.springbootwithspringjdbc1.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootWithSpringJdbc1Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootWithSpringJdbc1Application.class, args);

        Student student = context.getBean(Student.class);
        student.setMarks(78);
        student.setName("Rahul");
        student.setRollNo(1);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.addStudent(student);

        List<Student> studentList = studentService.getStudents();
    }

}
