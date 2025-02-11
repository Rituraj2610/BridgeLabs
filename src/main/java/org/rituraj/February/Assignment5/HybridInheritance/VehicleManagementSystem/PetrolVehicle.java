package org.rituraj.February.Assignment5.HybridInheritance.VehicleManagementSystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

