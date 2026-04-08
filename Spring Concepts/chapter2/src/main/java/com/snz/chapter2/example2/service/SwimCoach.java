package com.snz.chapter2.example2.service;

public class SwimCoach implements CoachInterface{
    @Override
    public void getDailyWorkout() {
        System.out.println("Swim 1000 meters as a warm up");
    }
}
