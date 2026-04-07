package com.snz.chapter2.controllers;

import com.snz.chapter2.dto.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
@Lazy
public class EmployeeController {

    @Value("${employee.name}")
    private String name;

    @GetMapping("/")
    public String getMessage() {
        return "Hello "+name;
    }

//    @GetMapping("/employee")
//    public Employee getEmployee() {
//        return new Employee(1L, "Neha", "Neha@gmail.com", "1234567890", "123 Main St", "2023-01-01");
//    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return new Employee(4L, "NehaMN", "Neha@gmail.com", "1234567890", "123 Main St", "2023-01-01");
    }

    @GetMapping("/employee")
    public Employee getEmployee(@RequestParam String id) {
        return new Employee(5L, "NehaFarheen MN", "Neha@gmail.com", "1234567890", "123 Main St", "2023-01-01");
    }
}
