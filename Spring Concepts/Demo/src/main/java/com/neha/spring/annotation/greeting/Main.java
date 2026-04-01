package com.neha.spring.annotation.greeting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
         ApplicationContext context = new AnnotationConfigApplicationContext(Apprunner.class);
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.neha.spring.annotation");
         Apprunner apprunner = context.getBean(Apprunner.class);
         apprunner.run();
    }
}
