package org.rituraj.February.Assignment5.AssistedProblems.VehicleTransportSystem;

public class Vehicle {
    private int maxSpeed;
    private String fuelType;

    Vehicle(int maxSpeed, String  fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayDetails(){
        System.out.printf("MaxSpeed: %d, FuelType: %s ", maxSpeed, fuelType);
    }
}
