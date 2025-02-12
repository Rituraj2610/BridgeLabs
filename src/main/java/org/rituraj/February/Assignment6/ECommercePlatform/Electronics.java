package org.rituraj.February.Assignment6.ECommercePlatform;

public class Electronics extends Product implements Taxable {
    private static final double ELECTRONICS_TAX_RATE = 0.15;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * ELECTRONICS_TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 15%";
    }
}
