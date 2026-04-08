package com.neha.beforespring;

public class CourseService {
    public Courses courses;

    public CourseService(Courses courses){
        this.courses=courses;
    }

    public CourseService(){

    }
    public void setCourse(Courses courses){
        this.courses= courses;
    }
    
    public void getCourse(){
        this.courses.getCourse();
    }
}
