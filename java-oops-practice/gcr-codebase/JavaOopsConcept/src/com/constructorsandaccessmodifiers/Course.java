package com.constructorsandaccessmodifiers;

public class Course {

    // Instance variables (unique for each course)
    private String courseName;
    private int duration;     // duration in weeks
    private double fee;

    // Class variable (common for all courses)
    private static String instituteName = "BridgeLabz";

    // Parameterized Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " weeks");
        System.out.println("Fee            : ₹" + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing
    public static void main(String[] args) {

        Course c1 = new Course("Core Java", 8, 12000);
        Course c2 = new Course("Full Stack Development", 16, 45000);

        c1.displayCourseDetails();
        System.out.println();

        c2.displayCourseDetails();
        System.out.println();

        // Update institute name for all courses
        Course.updateInstituteName("Capgemini Training Center");

        System.out.println("After updating institute name:\n");

        c1.displayCourseDetails();
        System.out.println();

        c2.displayCourseDetails();
    }
}
