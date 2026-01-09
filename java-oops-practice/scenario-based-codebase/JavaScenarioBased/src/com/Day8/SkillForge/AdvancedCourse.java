package com.Day8.SkillForge;

class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(Student student) {
        System.out.println("Advanced Level Professional Certificate");
        System.out.println("Awarded to: " + student.name);
    }
}
