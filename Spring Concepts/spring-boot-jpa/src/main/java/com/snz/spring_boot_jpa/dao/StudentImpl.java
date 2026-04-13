package com.snz.spring_boot_jpa.dao;

import com.snz.spring_boot_jpa.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//CRUD operations
@Repository
public class StudentImpl implements StudentDao {

    private EntityManager entityManager;

    @Autowired
    public StudentImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
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
    public Student findById(Integer id) {
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("No student found with ID: " + id);
        }
        return student;
    }

    public List<Student> findAll() {
        TypedQuery<Student> queryTyped= entityManager.createQuery("SELECT s FROM Student s", Student.class);
        List<Student> list=queryTyped.getResultList();
        return list;
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query=entityManager.createQuery("SELECT s FROM Student s WHERE s.last_name=:lastName", Student.class);
        query.setParameter("lastName", lastName);
        List<Student> list=query.getResultList();
        return list;
    }


    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            entityManager.remove(student);
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }

    @Override
    @Transactional
    public int deleteAll() {
        int status= entityManager.createQuery("delete from Student").executeUpdate();
        return status;
    }
}
