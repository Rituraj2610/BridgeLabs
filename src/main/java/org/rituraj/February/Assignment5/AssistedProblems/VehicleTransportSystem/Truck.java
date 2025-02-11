package org.rituraj.February.Assignment5.AssistedProblems.VehicleTransportSystem;

public class Truck extends Vehicle{
    private int weight;

    Truck(int maxSpeed, String  fuelType, int weight){
        super(maxSpeed, fuelType);
        this.weight = weight;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.printf("Weight: %d", weight);
    }
}
