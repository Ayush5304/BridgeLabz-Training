package com.CollectorsMethod;

import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {

    static class Student {
        String name;
        String grade;

        public Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ayush", "A"),
                new Student("Rohit", "B"),
                new Student("Neha", "A"),
                new Student("Karan", "C"),
                new Student("Pooja", "B")
        );

        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        System.out.println(" Student Grouped by Grade:");
        result.forEach((grade, names) ->
                System.out.println("Grade " + grade + " → " + names));
    }
}
