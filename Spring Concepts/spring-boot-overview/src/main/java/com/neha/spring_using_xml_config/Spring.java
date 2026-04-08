package com.neha.spring_using_xml_config;

public class Spring implements Courses {
    public Spring(){
        System.out.println("Spring bean created");
    }
    @Override
    public void getCourse() {
        System.out.println("This is Spring course");
    }
}
