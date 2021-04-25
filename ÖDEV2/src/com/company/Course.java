package com.company;

public class Course {
    String _courseName;
    Instructor _courseInstructor;
    int _courseId;
    public Course(){

    }

    public Course(String courseName, Instructor courseInstructor , int courseId){
        _courseInstructor = courseInstructor;
        _courseName = courseName;
        _courseId = courseId;
    }
}
