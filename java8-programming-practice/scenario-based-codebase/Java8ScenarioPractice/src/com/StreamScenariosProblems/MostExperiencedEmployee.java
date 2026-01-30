package com.StreamScenariosProblems;

import java.util.*;

public class MostExperiencedEmployee {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        Employee mostExp =
                employees.stream()
                        .min(Comparator.comparing(Employee::getYearOfJoining))
                        .orElse(null);

        System.out.println(mostExp);
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Ayush",23,"Male","IT",2019,60000),
                new Employee(2,"Neha",25,"Female","HR",2018,55000),
                new Employee(3,"Amit",35,"Male","Management",2012,90000)
        );
    }
}
