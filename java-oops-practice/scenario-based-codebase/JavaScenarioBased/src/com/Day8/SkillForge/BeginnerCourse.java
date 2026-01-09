package com.Day8.SkillForge;

class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(Student student) {
        System.out.println("Beginner Level Certificate");
        System.out.println("Awarded to: " + student.name);
    }
}
