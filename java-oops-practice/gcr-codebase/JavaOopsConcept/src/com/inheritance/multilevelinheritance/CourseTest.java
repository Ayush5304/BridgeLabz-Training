package com.inheritance.multilevelinheritance;

public class CourseTest {

    public static void main(String[] args) {

        PaidOnlineCourse course =
                new PaidOnlineCourse("Java Full Stack",
                        120, "Udemy", true,
                        5000, 1000);

        System.out.println("Course Name: " + course.courseName);
        System.out.println("Duration: " + course.duration + " hrs");
        System.out.println("Platform: " + course.platform);
        System.out.println("Recorded: " + course.isRecorded);
        System.out.println("Final Fee: ₹" + course.calculateFinalFee());
    }
}
