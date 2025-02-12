package org.rituraj.February.Assignment6.RideHailingApplication;

public class Main {
    public static void calculateFareForVehicle(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));
    }

    public static void main(String[] args) {
        // Create a Car, Bike, and Auto
        Vehicle car = new Car("V001", "A", 1.5, "A");
        Vehicle bike = new Bike("V002", "B", 1.0, "B");
        Vehicle auto = new Auto("V003", "c", 1.2, "C");

        calculateFareForVehicle(car, 10.0);
        calculateFareForVehicle(bike, 10.0);
        calculateFareForVehicle(auto, 10.0);

        System.out.println("Current location of Car: " + ((GPS) car).getCurrentLocation());
        ((GPS) car).updateLocation("City Center");
        System.out.println("Updated location of Car: " + ((GPS) car).getCurrentLocation());
    }
}