package com.StreamScenariosProblems;

import java.util.*;

public class OrganizationSalaryStats {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        DoubleSummaryStatistics stats =
                employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .summaryStatistics();

        System.out.println("Average Salary → " + stats.getAverage());
        System.out.println("Total Salary   → " + stats.getSum());
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Ayush",23,"Male","IT",2019,60000),
                new Employee(2,"Neha",25,"Female","HR",2018,55000),
                new Employee(3,"Rohit",28,"Male","Finance",2016,75000)
        );
    }
}
