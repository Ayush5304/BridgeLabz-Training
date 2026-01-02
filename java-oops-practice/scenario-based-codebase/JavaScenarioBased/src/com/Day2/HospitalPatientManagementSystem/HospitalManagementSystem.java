package com.Day2.HospitalPatientManagementSystem;
public class HospitalManagementSystem {

    public static void main(String[] args) {

        Patient p1 = new InPatient("Rahul", 30, 5);
        Patient p2 = new OutPatient("Amit", 25);

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiologist");

        Bill bill = new Bill(5000, 0.18, 500);

        System.out.println("Patient Details ");
        p1.displayInfo();
        p2.displayInfo();

        System.out.println("\n Doctor Details ");
        d1.displayInfo();

        System.out.println("\n Billing ");
        System.out.println("Total Payable Amount: ₹" + bill.calculatepayment());
    }
}
