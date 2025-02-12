package org.rituraj.February.Assignment6.OnlineFoodDeliverySystem;

class VegItem extends FoodItem implements Discountable {
    private double discountApplied = 0.0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discountApplied;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discountApplied = (getPrice() * getQuantity()) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: $" + discountApplied;
    }
}