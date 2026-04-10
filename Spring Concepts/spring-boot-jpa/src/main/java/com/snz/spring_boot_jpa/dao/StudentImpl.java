package com.snz.spring_boot_jpa.dao;

import com.snz.spring_boot_jpa.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//CRUD operations
@Repository
public class StudentImpl implements StudentDao {

    private EntityManager entityManager;

    @Autowired
    public StudentImpl(EntityManager entityManager) {
        this.entityManager=entityManager;
    }

    //create
     @Override
     @Transactional
     public void save(Student student) {
         System.out.println("Saving student: " + student);
         entityManager.persist(student);
     }

     //read
    @Override
    public void findById(Integer id) {
            Student student = entityManager.find(Student.class, id);
            if (student != null) {
                System.out.println("Student found: " + student);
            } else {
                System.out.println("No student found with ID: " + id);
            }
    }
}
