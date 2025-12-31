package com.inheritance.hierarchicalinheritance;

public class Staff extends Person {

    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Staff Member");
        System.out.println("Department: " + department);
    }
}
