package com.Day4.ExamCell;

public class ExamCell {

    public static void main(String[] args) {

        Student[] students = {
                new Student(101, 85),
                new Student(102, 92),
                new Student(103, 78),
                new Student(104, 88),
                new Student(105, 95),
                new Student(106, 70),
                new Student(107, 90),
                new Student(108, 82)
        };

        System.out.println("Before Ranking:");
        printStudents(students);

        MergeSortUtil.mergeSort(students, 0, students.length - 1);

        System.out.println("\nAfter Ranking (State Level):");
        printStudents(students);

        System.out.println("\nTop 3 Rank Holders:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Rank " + (i + 1) + " → " + students[i]);
        }
    }

    public static void printStudents(Student[] students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
