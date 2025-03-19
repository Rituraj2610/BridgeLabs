package org.rituraj.generics.smart_warehouse_system;

public abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "WarehouseItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
