package com.neha.spring_using_xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Loading applicationconfig.xml...");
        //using application Context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/neha/spring_using_xml_config/applicationconfig.xml");

//        CourseService courseService = (CourseService) applicationContext.getBean("courseService");
//        courseService.getCourse();
    }
}
