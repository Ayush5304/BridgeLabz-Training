package com.StreamScenariosProblems;

import java.util.*;

public class YoungestMaleInProductDev {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        Employee youngest =
                employees.stream()
                        .filter(e -> e.getGender().equalsIgnoreCase("Male"))
                        .filter(e -> e.getDepartment().equalsIgnoreCase("Product Development"))
                        .min(Comparator.comparing(Employee::getAge))
                        .orElse(null);

        System.out.println(youngest);
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Ayush",23,"Male","Product Development",2019,60000),
                new Employee(2,"Rohit",28,"Male","Product Development",2016,75000),
                new Employee(3,"Amit",35,"Male","Management",2012,90000)
        );
    }
}
