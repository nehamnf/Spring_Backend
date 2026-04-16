package com.snz.sping_boot_rest_employee.dao;

import com.snz.sping_boot_rest_employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
    public Employee findById(int id);
    public Employee save(Employee employee);
    public int deleteById(int id);
}
