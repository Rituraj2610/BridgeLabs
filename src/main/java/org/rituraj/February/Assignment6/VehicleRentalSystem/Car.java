package org.rituraj.February.Assignment6.VehicleRentalSystem;

class Car extends Vehicle implements Insurable {
    private static final double CAR_INSURANCE_RATE = 20.0;

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return CAR_INSURANCE_RATE * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: $" + CAR_INSURANCE_RATE + " per day";
    }
}
