package com.StreamScenariosProblems;

import java.util.*;
import java.util.stream.Collectors;

public class GenderCount {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        Map<String, Long> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.counting()
                        ));

        result.forEach((k, v) -> System.out.println(k + " → " + v));
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
