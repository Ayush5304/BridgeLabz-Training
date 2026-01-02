package com.linkedlist.Singlylinkedlist.StudentRecordManagement;


public class StudentManagementSystem {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Ayush", 20, 'A');
        list.addAtEnd(2, "Rohit", 21, 'B');
        list.addAtPosition(2, 3, "Aman", 19, 'A');

        System.out.println("All Students:");
        list.display();

        System.out.println("\nSearch Student:");
        list.searchByRollNo(2);

        System.out.println("\nUpdate Grade:");
        list.updateGrade(2, 'A');

        System.out.println("\nAfter Update:");
        list.display();

        System.out.println("\nDelete Student:");
        list.deleteByRollNo(1);

        System.out.println("\nFinal List:");
        list.display();
    }
}