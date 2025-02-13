package org.rituraj.February.assignment4.self_problems.ecommerce_platform;

import java.util.ArrayList;

class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Products: " + products;
    }
}