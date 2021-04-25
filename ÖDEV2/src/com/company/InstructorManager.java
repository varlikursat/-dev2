package com.company;

public class InstructorManager {

    public void displayInstructor(Instructor instructor){
        System.out.println(
                "--Eğitmen Bilgileri--" +
                "/n" + "Eğitmen İsmi: " + instructor.instructorName+
                "/n" + "Deneyim Yılı: " + instructor.yearOfExperience);
    }
}
