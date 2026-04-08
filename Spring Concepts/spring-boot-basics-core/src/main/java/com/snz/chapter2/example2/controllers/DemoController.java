package com.snz.chapter2.example2.controllers;

import com.snz.chapter2.example2.service.CoachInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private CoachInterface coach;
    private CoachInterface anotherCoach;

    @Autowired
    public DemoController(CoachInterface coach, CoachInterface anotherCoach){
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/")
    public String getMessage(){
        return "Hi There!!!!!!!";
    }

    @GetMapping("/check")
    public String check(){
        return "Pointing to the same object: "+(coach==anotherCoach);
    }
}
