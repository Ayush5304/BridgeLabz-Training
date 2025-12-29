package com.constructorsandaccessmodifiers;
//Child class
public class Manager extends EmployeeRecords {

// Method to display accessible details
public void displayDetails() {

   // Accessing public variable
   System.out.println("Employee ID: " + employeeID);

   // Accessing protected variable
   System.out.println("Department: " + department);

   // Accessing private variable using public method
   System.out.println("Salary: " + getSalary());
}
}
