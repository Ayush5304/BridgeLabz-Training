package com.encapsulationandpolymorphism.HospitalPatientManagement;
import java.util.ArrayList;
import java.util.List;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getters (controlled access)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Bill Amount: ₹" + calculateBill());
    }
}
