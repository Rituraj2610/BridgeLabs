package org.rituraj.February.Assignment6.HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {
    private static final double ROOM_CHARGE_PER_DAY = 500.0;
    private static final double MEDICAL_EXPENSES = 1000.0;
    private int numberOfDays;
    private List<String> medicalRecords;


    public InPatient(String patientId, String name, int age, String diagnosis, int numberOfDays) {
        super(patientId, name, age, diagnosis);
        this.numberOfDays = numberOfDays;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return (ROOM_CHARGE_PER_DAY * numberOfDays) + MEDICAL_EXPENSES;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}