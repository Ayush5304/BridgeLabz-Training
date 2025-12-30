package com.constructorsandaccessmodifiers;
class Student {

    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double cgpa;

    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public method to modify CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

// Subclass demonstrating protected access
class PostgraduateStudent extends Student {

    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method using protected member
    public void displayDetails() {
        System.out.println("Roll Number    : " + rollNumber); // public
        System.out.println("Name           : " + name);       // protected
        System.out.println("CGPA           : " + getCGPA());  // private via getter
        System.out.println("Specialization : " + specialization);
    }
}