package com.snz.sping_boot_rest_employee.controller;


import com.snz.sping_boot_rest_employee.entity.Employee;
import com.snz.sping_boot_rest_employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService, ObjectMapper objectMapper) {
        this.employeeService = employeeService;

    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee) {
        employee.setId(0);
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable int id) {
        employeeService.deleteById(id);
    }

    @PutMapping("/employees/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee employee) {
        employee.setId(id); //
        return employeeService.save(employee);
    }

    @PatchMapping("/employees/{id}")
    public Employee patch(@PathVariable int id, @RequestBody Map<String, Object> employeePatchPayLoad) {
        return employeeService.patchEmployee(id, employeePatchPayLoad);
    }
}
