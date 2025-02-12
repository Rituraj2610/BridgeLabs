package org.rituraj.February.Assignment6.VehicleRentalSystem;

class Bike extends Vehicle implements Insurable {
    private static final double BIKE_INSURANCE_RATE = 10.0;

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return BIKE_INSURANCE_RATE * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: $" + BIKE_INSURANCE_RATE + " per day";
    }
}
