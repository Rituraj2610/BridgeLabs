package org.rituraj.February.Assignment6.OnlineFoodDeliverySystem;

class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 10.0;
    private double discountApplied = 0.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + ADDITIONAL_CHARGE) - discountApplied;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discountApplied = (getPrice() * getQuantity() + ADDITIONAL_CHARGE) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: $" + discountApplied;
    }
}