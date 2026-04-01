package com.neha.spring_using_xml_config;

import org.springframework.stereotype.Component;

@Component
public class JavaCourse implements Courses {
    
    @Override
    public void getCourse() {
        System.out.println("Java Course is being taught");
    }
}
