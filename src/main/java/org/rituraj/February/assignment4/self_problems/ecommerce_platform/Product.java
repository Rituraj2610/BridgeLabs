package org.rituraj.February.assignment4.self_problems.ecommerce_platform;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price;
    }
}
