package com.Day4.HospitalQueue;

public class HospitalQueue {

 public static void sortByCriticality(Patient[] patients) {
     int n = patients.length;

     for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
             if (patients[j].getCriticality() < patients[j + 1].getCriticality()) {
                 Patient temp = patients[j];
                 patients[j] = patients[j + 1];
                 patients[j + 1] = temp;
             }
         }
     }
 }

 public static void displayPatients(Patient[] patients) {
     for (Patient p : patients) {
         System.out.println( "Name: " + p.getName() + ", Arrival Time: " + p.getArrivalTime() + ", Criticality: " + p.getCriticality() );
     }
 }
}
