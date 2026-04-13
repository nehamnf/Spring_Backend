package com.snz.spring_boot_jpa.dao;

import com.snz.spring_boot_jpa.entity.Student;

import java.util.List;

public interface StudentDao {
    public void save(Student student);
    public Student findById(Integer id);
    public List<Student> findAll();
    public List<Student> findByLastName(String lastName);
    public void update(Student student);
    public void delete(Integer id);
    public int deleteAll();
}
