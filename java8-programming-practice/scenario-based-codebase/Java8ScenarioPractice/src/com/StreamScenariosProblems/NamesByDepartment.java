package com.StreamScenariosProblems;

import java.util.*;
import java.util.stream.Collectors;

public class NamesByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        Map<String, List<String>> map =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(Employee::getName, Collectors.toList())
                        ));

        map.forEach((k, v) -> System.out.println(k + " → " + v));
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Ayush",23,"Male","IT",2019,60000),
                new Employee(2,"Neha",25,"Female","HR",2018,55000),
                new Employee(3,"Rohit",28,"Male","Finance",2016,75000)
        );
    }
}
