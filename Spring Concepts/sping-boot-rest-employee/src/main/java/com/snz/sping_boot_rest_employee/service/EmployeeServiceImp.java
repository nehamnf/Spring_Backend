package com.snz.sping_boot_rest_employee.service;

import com.snz.sping_boot_rest_employee.dao.EmployeeDAO;
import com.snz.sping_boot_rest_employee.entity.Employee;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImp implements EmployeeService{

    private final EmployeeDAO employeeDAO;
    private final ObjectMapper  objectMapper;

    public EmployeeServiceImp(EmployeeDAO employeeDAO, ObjectMapper objectMapper)
    {
        this.employeeDAO = employeeDAO;
        this.objectMapper = objectMapper;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        Employee employee = employeeDAO.findById(id);
        if (employee == null) {
            throw new RuntimeException("Employee not found: " + id);
        }
        return employee;
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {

       int rows =employeeDAO.deleteById(id);

        if (rows == 0) {
            throw new RuntimeException("Employee not found: " + id);
        }
    }

    @Override
    @Transactional
    public Employee patchEmployee(int id, Map<String, Object> employeePatchPayLoad) {

        Employee existing = employeeDAO.findById(id);

        if (existing == null) {
            throw new RuntimeException("Employee not found: " + id);
        }
//        if (employeePatchPayLoad.containsKey("id") && !employeePatchPayLoad.get("id").equals(existing.getId())) {
//            throw new RuntimeException("Id cannot be changed");
//        }
        employeePatchPayLoad.remove("id");

        objectMapper.updateValue(existing, employeePatchPayLoad);

        return employeeDAO.save(existing);
    }
}
