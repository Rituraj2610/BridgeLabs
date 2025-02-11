package org.rituraj.February.Assignment5.AssistedProblems.VehicleTransportSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle arr[] = {
                new Car(100, "Petrol", 4),
                new Truck(60, "Diesel", 200),
        };

        for(Vehicle v : arr){
            v.displayDetails();
            System.out.println();
        }
    }
}
