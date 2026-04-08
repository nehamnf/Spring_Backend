package com.neha.spring.annotation.bakery;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Strawberry syrup");
    }
}
