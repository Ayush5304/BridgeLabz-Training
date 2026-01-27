package com.CSVDataHandling.IntermediateProblems;

import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class SortEmployees {
    public static void main(String[] args) {

        String filePath = "employees.csv";
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                list.add(new Employee(
                        Integer.parseInt(d[0]),
                        d[1], d[2],
                        Double.parseDouble(d[3])
                ));
            }

            list.sort((a, b) -> Double.compare(b.salary, a.salary));

            System.out.println("Top 5 Highest Paid Employees:\n");

            list.stream().limit(5).forEach(e ->
                    System.out.println(e.id + " " + e.name + " " + e.dept + " " + e.salary)
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
