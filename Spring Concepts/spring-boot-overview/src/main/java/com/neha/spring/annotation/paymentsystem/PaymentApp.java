package com.neha.spring.annotation.paymentsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.neha.spring.annotation.paymentsystem");
        AlertService alertService = context.getBean(AlertService.class);
        alertService.sendAlert();


    }
}
