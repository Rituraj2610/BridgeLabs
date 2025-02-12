package org.rituraj.February.Assignment6.HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

class OutPatient extends Patient implements MedicalRecord {
    private static final double CONSULTATION_FEE = 200.0;
    private static final double PRESCRIPTION_COST = 50.0;
    private List<String> medicalRecords;


    public OutPatient(String patientId, String name, int age, String diagnosis) {
        super(patientId, name, age, diagnosis);
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return CONSULTATION_FEE + PRESCRIPTION_COST;
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