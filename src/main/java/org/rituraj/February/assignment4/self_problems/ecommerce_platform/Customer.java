package org.rituraj.February.assignment4.self_problems.ecommerce_platform;

import java.util.ArrayList;

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
