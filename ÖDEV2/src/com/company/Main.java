package com.company;

public class Main {

    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Engin Demiroğ" , 10 ,1);
        Course course1 = new Course("JAVA-REACT",instructor1,1);
        Course course2 = new Course("C# Eğitimi",instructor1,2);
        CourseManager courseManager = new CourseManager();
        Course[] courses = {course1,course2};

        // KURS BİLGİLERİNİ EKRANA GETİRME

        for ( Course course : courses){
            courseManager.displayCourse(course);
            System.out.println("-----------");
        }
    }
}
