package com.StreamScenariosProblems;

import java.util.*;

public class HighestPaidEmployee {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        Employee highest =
                employees.stream()
                        .max(Comparator.comparing(Employee::getSalary))
                        .orElse(null);

        System.out.println(highest);
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Ayush",23,"Male","IT",2019,60000),
                new Employee(2,"Neha",25,"Female","HR",2018,55000),
                new Employee(3,"Rohit",28,"Male","Finance",2016,75000),
                new Employee(4,"Pooja",22,"Female","IT",2021,50000),
                new Employee(5,"Karan",30,"Male","HR",2014,80000),
                new Employee(6,"Anjali",27,"Female","Finance",2017,72000),
                new Employee(7,"Amit",35,"Male","Management",2012,90000)
        );
    }
}
