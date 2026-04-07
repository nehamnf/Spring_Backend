package com.neha.spring.annotation.bakery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Chocolate frosting");
    }
}
