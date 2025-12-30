package com.constructorsandaccessmodifiers;

public class EmployeeMain {
    public static void main(String[] args) {

        Manager manager = new Manager();

        // Setting values
        manager.employeeID = 201;
        manager.department = "HR";

        // Modifying salary using public method
        manager.setSalary(45000);

        // Display details
        manager.displayDetails();
    }
}