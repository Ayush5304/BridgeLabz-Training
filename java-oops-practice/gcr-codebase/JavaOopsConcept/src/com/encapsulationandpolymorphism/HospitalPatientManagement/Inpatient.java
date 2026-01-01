package com.encapsulationandpolymorphism.HospitalPatientManagement;

public class Inpatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private static final double DAILY_CHARGE = 3000;

    public Inpatient(int id, String name, int age, String diagnosis, int daysAdmitted) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * DAILY_CHARGE;
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
