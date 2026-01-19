package com.Day7.EduResults;

public class StudentMarksList {

    public static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(Student[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].marks <= R[j].marks) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student(1, "Aman", 85),
                new Student(2, "Rahul", 90),
                new Student(3, "Neha", 95),
                new Student(4, "Priya", 88),
                new Student(5, "Rohit", 92),
                new Student(6, "Kunal", 80),
                new Student(7, "Ankit", 93)
        };

        mergeSort(students, 0, students.length - 1);

        System.out.println("Final State Rank List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
