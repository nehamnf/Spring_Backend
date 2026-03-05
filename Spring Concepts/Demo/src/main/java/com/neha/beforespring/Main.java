package com.neha.beforespring;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new  CourseService();
        courseService.setCourse(new Java()); //setter injection
        courseService.getCourse();
        courseService.setCourse(new Spring());
        courseService.getCourse();
    }
}
