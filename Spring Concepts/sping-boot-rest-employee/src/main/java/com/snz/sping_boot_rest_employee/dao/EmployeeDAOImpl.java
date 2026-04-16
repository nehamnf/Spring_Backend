package com.snz.sping_boot_rest_employee.dao;

import com.snz.sping_boot_rest_employee.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements  EmployeeDAO {

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("select e from Employee e", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
//    public void deleteById(int id) {
//        Employee employee = entityManager.find(Employee.class, id);
//        if(employee != null) {
//            entityManager.remove(employee);
//            }
//        }
    public int deleteById(int id){
        return entityManager.createQuery("delete from Employee e where e.id = :id").setParameter("id", id).executeUpdate();
    }

}
