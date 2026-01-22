package com.Day10.HospitalQueueManagement;

public class HospitalAVLMain {

    public static void main(String[] args) {

        HospitalAVL hospital = new HospitalAVL();

        hospital.registerPatient(930, "Amit");
        hospital.registerPatient(1015, "Neha");
        hospital.registerPatient(845, "Ravi");
        hospital.registerPatient(1100, "Pooja");
        hospital.registerPatient(900, "Karan");

        hospital.displayPatients();

        System.out.println("\n Discharging patient checked-in at 900");
        hospital.dischargePatient(900);

        hospital.displayPatients();
    }
}
