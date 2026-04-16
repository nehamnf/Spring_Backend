package com.snz.sping_boot_rest_employee.service;

import com.snz.sping_boot_rest_employee.entity.Employee;

import java.util.List;
import java.util.Map;


public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(int id);
    public Employee save(Employee employee);
    public void deleteById(int id);
    public Employee patchEmployee(int id, Map<String, Object> employeePatchPayLoad);
}
