package com.inheritance.hierarchicalinheritance;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Person in School");
    }
}
