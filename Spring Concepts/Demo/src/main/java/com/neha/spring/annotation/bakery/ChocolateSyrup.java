package com.neha.spring.annotation.bakery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateSyrup implements Syrup{

    @Override
    public void getSyrupType() {
        System.out.println("Chocolate syrup");
    }
}
