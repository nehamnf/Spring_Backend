package com.snz.spring_boot_jpa.dao;

import com.snz.spring_boot_jpa.entity.Student;

public interface StudentDao {
    public void save(Student student);
    public void findById(Integer id);

}
