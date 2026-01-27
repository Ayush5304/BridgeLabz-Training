package com.Day1.MarkMate;


import java.util.Map;

public class Student {

    private int rollNo;
    private String name;
    private Map<String, Integer> marks;
    private int total;
    private double average;
    private String grade;

    public Student(int rollNo, String name, Map<String, Integer> marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        calculate();
    }

    private void calculate() {
        total = marks.values().stream().mapToInt(i -> i).sum();
        average = total / (double) marks.size();

        if (average >= 90) grade = "A+";
        else if (average >= 80) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 60) grade = "C";
        else grade = "D";
    }
}

