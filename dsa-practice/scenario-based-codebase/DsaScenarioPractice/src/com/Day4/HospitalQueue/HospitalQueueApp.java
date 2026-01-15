package com.Day4.HospitalQueue;

public class HospitalQueueApp {
 public static void main(String[] args) {

     Patient[] patients = {
         new Patient("Rohit", 10, 4),
         new Patient("Aman", 12, 8),
         new Patient("Neha", 15, 6),
         new Patient("Priya", 18, 9),
         new Patient("Vikas", 20, 3)
     };

     System.out.println("Before Sorting:");
     HospitalQueue.displayPatients(patients);

     HospitalQueue.sortByCriticality(patients);

     System.out.println("\nAfter Sorting by Criticality (High to Low):");
     HospitalQueue.displayPatients(patients);
 }
}
