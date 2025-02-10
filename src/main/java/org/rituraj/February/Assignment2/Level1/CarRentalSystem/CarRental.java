package org.rituraj.February.Assignment2.Level1.CarRentalSystem;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 50.0; // Default daily rate

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel +
                ", Rental Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("John Doe", "Toyota Corolla", 5);
        rental1.displayRentalDetails();
    }
}

