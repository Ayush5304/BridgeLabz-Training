package com.Day8.SkillForge;

class Course implements ICertifiable {

    private String title;
    private Instructor instructor;
    private double rating;       
    private String[] modules;

    private final String[] reviews = {"Well structured", "Good explanations" };

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Core Concepts", "Final Project"};
    }

    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = newRating;
        }
    }

    public double getRating() {
        return rating;
    }

    public String[] getReviews() {
        return reviews; 
    }

    @Override
    public void generateCertificate(Student student) {
        System.out.println("Certificate of Completion");
        System.out.println("Student: " + student.name);
        System.out.println("Course: " + title);
    }
}
