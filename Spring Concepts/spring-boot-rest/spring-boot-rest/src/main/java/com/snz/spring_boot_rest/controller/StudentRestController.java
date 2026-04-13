package com.snz.spring_boot_rest.controller;

import com.snz.spring_boot_rest.entity.Student;
import com.snz.spring_boot_rest.entity.StudentErrorResponse;
import com.snz.spring_boot_rest.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void initStudents() {
        students = new ArrayList<>();
        students.add(new Student("Neha", "Mishra"));
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Doe"));
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return students;
    }

@GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        if(id > students.size() || id < 0){
            throw new StudentNotFoundException("Student not found with id: " + id);
        }
        return students.get(id);
    }
}
