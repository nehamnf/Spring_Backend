package com.neha.spring_using_xml_config;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Loading applicationconfig.xml...");
//       // using application Context
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/neha/spring_using_xml_config/applicationconfig.xml");
//        CourseService courseService = (CourseService) applicationContext.getBean("courseService");
//        courseService.getCourse();
//
//        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//        xmlBeanDefinitionReader.loadBeanDefinitions("com/neha/spring_using_xml_config/applicationconfig.xml");
//
//        CourseService courseService = (CourseService) defaultListableBeanFactory.getBean("courseService");
//        courseService.getCourse();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.getBean(CourseService.class);
        context.getBean("courseService");
    }
}
