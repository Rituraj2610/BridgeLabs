package org.rituraj.February.Assignment2.Level1.HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "Aman", 22, "Fever");
        Patient patient2 = new Patient(102, "Adarsh", 23, "Cold");

        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}

