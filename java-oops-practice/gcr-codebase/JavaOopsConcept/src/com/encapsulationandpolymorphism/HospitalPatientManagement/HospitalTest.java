package com.encapsulationandpolymorphism.HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalTest {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new Inpatient(101, "Rahul", 35, "Fracture", 5);
        Patient p2 = new OutPatient(102, "Amit", 28, "Fever");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {

            p.getPatientDetails();

            MedicalRecord mr = (MedicalRecord) p;
            mr.addRecord("Initial checkup completed");
            mr.addRecord("Medication prescribed");
            mr.viewRecords();

            System.out.println("");
        }
    }
}

