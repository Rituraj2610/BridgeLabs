package org.rituraj.February.assignment4.self_problems.hospital_doctors_and_patients;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Brown");

        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("John");

        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor1.consult(patient2);

        patient1.viewDoctors();
        doctor1.viewPatients();
    }
}