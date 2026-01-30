package com.StreamScenariosProblems;
import java.util.*;
import java.util.stream.Collectors;

public class GenderCountInSales {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        Map<String, Long> count =
                employees.stream()
                        .filter(e -> e.getDepartment().equalsIgnoreCase("Sales"))
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.counting()
                        ));

        count.forEach((k, v) -> System.out.println(k + " → " + v));
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Raj",29,"Male","Sales",2015,65000),
                new Employee(2,"Suman",26,"Female","Sales",2019,58000),
                new Employee(3,"Vikas",24,"Male","IT",2020,62000)
        );
    }
}
