package com.inheritance.hierarchicalinheritance;

public class Teacher extends Person {

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Teacher");
        System.out.println("Subject: " + subject);
    }
}
