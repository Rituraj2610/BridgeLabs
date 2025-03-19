package org.rituraj.generics.smart_warehouse_system;

public class Electronics extends WarehouseItem{
    private String brand;
    private int warranty;

    public Electronics(String name, double price, String brand, int warranty) {
        super(name, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return super.toString() + "Electronics{" +
                "brand='" + brand + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}
