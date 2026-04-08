package com.snz.chapter2.example2.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements CoachInterface {

    @Override
    public void getDailyWorkout() {
        System.out.println("Practice fast bowling for 15 minutes");
    }

    public CricketCoach(){
        System.out.println("Cricket Coach Constructor");
    }
}
