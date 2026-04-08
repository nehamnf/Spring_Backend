package com.neha.spring_using_xml_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private Courses courses;

//    public CourseService(Courses courses){
//        this.courses=courses;
//        System.out.println("Constructor injection is called");
//    }
    @Autowired
    public CourseService(){
        System.out.println("CourseService bean is created");
    }

    public void setCourses(Courses courses){
        System.out.println("Setter Injection has been called");
        this.courses= courses;
    }
    
    public void getCourse(){
        this.courses.getCourse();
    }
}
