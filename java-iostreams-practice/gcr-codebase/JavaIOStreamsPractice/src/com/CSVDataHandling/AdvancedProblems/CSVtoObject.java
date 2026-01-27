package com.CSVDataHandling.AdvancedProblems;

import java.io.*;
import java.util.*;

class Student {
    int id, age;
    String name;
    double marks;

    Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }
}

public class CSVtoObject {
    public static void main(String[] args) throws Exception {

        List<Student> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            list.add(new Student(
                Integer.parseInt(d[0]),
                d[1],
                Integer.parseInt(d[2]),
                Double.parseDouble(d[3])
            ));
        }

        list.forEach(System.out::println);
        br.close();
    }
}
