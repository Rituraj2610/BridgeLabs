package org.rituraj.February.Assignment6.VehicleRentalSystem;

class Truck extends Vehicle implements Insurable {
    private static final double TRUCK_INSURANCE_RATE = 30.0;

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return TRUCK_INSURANCE_RATE * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: $" + TRUCK_INSURANCE_RATE + " per day";
    }
}
