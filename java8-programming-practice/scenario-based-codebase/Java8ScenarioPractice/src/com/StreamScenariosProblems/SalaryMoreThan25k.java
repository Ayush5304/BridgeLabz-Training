package com.StreamScenariosProblems;

import java.util.*;

public class SalaryMoreThan25k {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        employees.stream()
                .filter(e -> e.getSalary() > 25000)
                .forEach(System.out::println);
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Ayush",23,"Male","IT",2019,60000),
                new Employee(2,"Neha",25,"Female","HR",2018,55000),
                new Employee(3,"Rohit",28,"Male","Finance",2016,75000)
        );
    }
}
