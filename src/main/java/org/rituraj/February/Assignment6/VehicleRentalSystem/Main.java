package org.rituraj.February.Assignment6.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Add different types of vehicles
        vehicles.add(new Car("CAR123", 50.0));
        vehicles.add(new Bike("BIKE456", 20.0));
        vehicles.add(new Truck("TRUCK789", 100.0));


        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleDetails();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                double insuranceCost = insurable.calculateInsurance(rentalDays);
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost for " + rentalDays + " days: $" + insuranceCost);
            }

        }
    }
}
