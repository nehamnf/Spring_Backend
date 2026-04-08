package com.neha.spring.annotation.greeting;

import org.springframework.stereotype.Component;

@Component
public class Greetings {
    public Greetings(){
        System.out.println("Greetings  constructor called");
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
