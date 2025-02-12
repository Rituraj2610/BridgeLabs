package org.rituraj.February.Assignment6.RideHailingApplication;

public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return "Driver Name: Protected (Confidential)";
    }

    public double getRatePerKm() {
        return ratePerKm;
    }


    public abstract double calculateFare(double distance);


    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: Confidential, Rate per Km: $" + ratePerKm;
    }
}
