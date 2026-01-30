package com.StreamScenariosProblems;
import java.util.*;

public class ThirdHighestPaidEmployee {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        Employee third =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .skip(2)
                        .findFirst()
                        .orElse(null);

        System.out.println(third);
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Ayush",23,"Male","IT",2019,60000),
                new Employee(2,"Rohit",28,"Male","Finance",2016,75000),
                new Employee(3,"Amit",35,"Male","Management",2012,90000)
        );
    }
}
