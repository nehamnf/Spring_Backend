package com.neha.spring.annotation.greeting;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.neha.spring.annotation")
public class Apprunner {

    private final Greetings greetings;
    public Apprunner(Greetings greetings){
        this.greetings = greetings;
    }

    public void run() {
        greetings.sayHello();
    }
}
