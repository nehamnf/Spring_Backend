package com.neha.spring.annotation.bakery;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting{
   @Override
   public void getFrostingType() {
       System.out.println("Strawberry Frosting");
   }
}
