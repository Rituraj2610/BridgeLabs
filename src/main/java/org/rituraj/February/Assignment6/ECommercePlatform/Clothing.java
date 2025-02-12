package org.rituraj.February.Assignment6.ECommercePlatform;

public class Clothing extends Product implements Taxable {
    private static final double CLOTHING_TAX_RATE = 0.08;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * CLOTHING_TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 8%";
    }
}
