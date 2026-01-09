package com.Day8.SkillForge;
public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor instructor =new Instructor("Shankar", "shankar@skillforge.com");

        Student student = new Student("Ayush", "ayush@gmail.com");

        Course course =  new AdvancedCourse("Java Full Stack", instructor);

        student.updateProgress(10, 10); 

        if (student.getProgress() == 100) {
            course.generateCertificate(student);
        }
    }
}
