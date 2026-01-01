package com.encapsulationandpolymorphism.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 =
                new FullTimeEmployee(101, "Rahul", 50000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2 =
                new PartTimeEmployee(102, "Amit", 500, 40);
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism in action
        for (Employee emp : employees) {
            emp.displayDetails();
            Department dept = (Department) emp;
            System.out.println("Department: " + dept.getDepartmentDetails());
            System.out.println("");
        }
    }
}
