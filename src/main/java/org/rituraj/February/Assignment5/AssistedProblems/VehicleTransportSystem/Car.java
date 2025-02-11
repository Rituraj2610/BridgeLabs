package org.rituraj.February.Assignment5.AssistedProblems.VehicleTransportSystem;

public class Car extends Vehicle{
    private int capacity;

    Car(int maxSpeed, String  fuelType, int capacity){
        super(maxSpeed, fuelType);
        this.capacity = capacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.printf("Capacity: %d", capacity);
    }
}
