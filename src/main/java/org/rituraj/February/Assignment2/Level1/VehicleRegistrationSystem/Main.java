package org.rituraj.February.Assignment2.Level1.VehicleRegistrationSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("XYZ123", "Aman", "Car");
        Vehicle vehicle2 = new Vehicle("ABC789", "Raj", "Motorcycle");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
