package com.AssessmentProblems;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int employeeID;
    String designation;

    Employee(int employeeID, String designation) {
        this.employeeID = employeeID;
        this.designation = designation;
    }
}

class EmployeeManagement {

    ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(int employeeID, String designation) {
        employees.add(new Employee(employeeID, designation));
    }

    void updateDesignation(int employeeID, String newDesignation) {
        for (Employee emp : employees) {
            if (emp.employeeID == employeeID) {
                emp.designation = newDesignation;
                System.out.println(emp.employeeID + " " + emp.designation);
                return;
            }
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManagement em = new EmployeeManagement();
        
        System.out.println("enter the no. of inputs");
        int n=sc.nextInt();
        
          for(int i=0; i<n; i++) {

            String input = sc.next();
            int id = sc.nextInt();
            String designation = sc.next();

            if (input.equals("A")) {
                em.addEmployee(id, designation);
            } 
            else if (input.equals("U")) {
                em.updateDesignation(id, designation);
            }
        }

        sc.close();
    }
}
