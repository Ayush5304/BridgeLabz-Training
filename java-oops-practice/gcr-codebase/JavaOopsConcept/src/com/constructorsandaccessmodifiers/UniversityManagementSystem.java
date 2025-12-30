package com.constructorsandaccessmodifiers;

//Main class
public class UniversityManagementSystem {

 public static void main(String[] args) {

     PostgraduateStudent student =
             new PostgraduateStudent(101, "Ayush Mishra", 8.4, "Computer Science");

     student.displayDetails();

     System.out.println("\nUpdating CGPA...\n");

     // Modifying CGPA using public setter
     student.setCGPA(8.9);

     student.displayDetails();
 }
}