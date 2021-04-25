package com.company;

public class CourseManager {

    public void addCourse(Course course){
        System.out.println("Kurs sisteme eklendi:" + course._courseName);
    }

    public void update(Course course){
        System.out.println(course._courseName + "Güncellenmiştir.");
    }

    public void displayCourse(Course course){
        System.out.println(
                "Kurs Adı: " + course._courseName + "\n"+
                "Kurs Eğitmeni: "  + course._courseInstructor.instructorName
        );
    }
}
