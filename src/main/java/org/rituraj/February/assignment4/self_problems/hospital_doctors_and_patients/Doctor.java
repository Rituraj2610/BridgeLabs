package org.rituraj.February.assignment4.self_problems.hospital_doctors_and_patients;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void consult(Patient patient) {
        System.out.println("Consulting " + patient.getName() + " by Dr. " + name);
    }

    public void viewPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}