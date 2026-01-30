package com.CollectorsMethod;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {

    static class Employee {
        String name;
        String department;
        double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ayush", "IT", 60000),
                new Employee("Rohit", "HR", 45000),
                new Employee("Neha", "IT", 70000),
                new Employee("Karan", "Finance", 55000),
                new Employee("Pooja", "HR", 50000),
                new Employee("Amit", "Finance", 65000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream() .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("💼 Average Salary By Department:\n");
        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " → " + avg));
    }
}
