package org.rituraj.February.Assignment6.HospitalPatientManagement;

public class Main {
    public static void displayPatientDetails(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: $" + patient.calculateBill());
    }

    public static void main(String[] args) {

        InPatient inPatient = new InPatient("P001", "A", 35, "A", 3);
        inPatient.addRecord("successful.");

        OutPatient outPatient = new OutPatient("P002", "b", 28, "b");
        outPatient.addRecord("Consulted");

        displayPatientDetails(inPatient);
        inPatient.viewRecords();

        displayPatientDetails(outPatient);
        outPatient.viewRecords();
    }
}