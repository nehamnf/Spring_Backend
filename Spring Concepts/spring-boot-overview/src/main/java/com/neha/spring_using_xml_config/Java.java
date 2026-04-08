package com.neha.spring_using_xml_config;

public class Java implements Courses {
    public Java(){
        System.out.println("Java bean created");
    }
    @Override
    public void getCourse() {
        System.out.println("This is java course");
    }
}
