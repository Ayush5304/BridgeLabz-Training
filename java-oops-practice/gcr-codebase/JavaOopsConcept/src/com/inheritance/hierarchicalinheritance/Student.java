package com.inheritance.hierarchicalinheritance;

public class Student extends Person {

    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Student");
        System.out.println("Grade: " + grade);
    }
}
