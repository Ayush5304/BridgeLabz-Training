package com.inheritance.hierarchicalinheritance;

public class SchoolTest {

    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Maths");
        Person p2 = new Student("Aman", 16, "10th");
        Person p3 = new Staff("Ramesh", 35, "Administration");

        p1.displayRole();
        System.out.println("");
        p2.displayRole();
        System.out.println("");
        p3.displayRole();
    }
}
