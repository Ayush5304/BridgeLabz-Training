package com.StreamScenariosProblems;

import java.util.*;

public class LowestPaidEmployee {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        Employee lowest =
                employees.stream()
                        .min(Comparator.comparing(Employee::getSalary))
                        .orElse(null);

        System.out.println(lowest);
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Ayush",23,"Male","IT",2019,60000),
                new Employee(2,"Rohit",28,"Male","Finance",2016,75000),
                new Employee(3,"Amit",35,"Male","Management",2012,90000)
        );
    }
}

