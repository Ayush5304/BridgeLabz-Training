package com.encapsulationandpolymorphism.HospitalPatientManagement;

public class OutPatient extends Patient implements MedicalRecord {

    private static final double CONSULTATION_FEE = 500;

    public OutPatient(int id, String name, int age, String diagnosis) {
        super(id, name, age, diagnosis);
    }

    @Override
    public double calculateBill() {
        return CONSULTATION_FEE;
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
