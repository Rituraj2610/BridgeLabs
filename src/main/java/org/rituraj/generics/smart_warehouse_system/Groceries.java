package org.rituraj.generics.smart_warehouse_system;

public class Groceries extends WarehouseItem{
    private String expiryDate;
    private double weight;

    public Groceries(String name, double price, String expiryDate, double weight) {
        super(name, price);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }

    // Getter methods
    public String getExpiryDate() {
        return expiryDate;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() + "Groceries{" +
                "expiryDate='" + expiryDate + '\'' +
                ", weight=" + weight +
                '}';
    }
}
