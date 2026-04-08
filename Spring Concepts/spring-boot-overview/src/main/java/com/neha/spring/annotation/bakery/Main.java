package com.neha.spring.annotation.bakery;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        // Example of using the context - you can add bean retrieval logic here
        System.out.println("Spring application context started successfully!");
        context.getBean(CakeBaker.class).bakeCake();
        context.close();
    }
}
