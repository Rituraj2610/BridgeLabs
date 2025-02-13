package org.rituraj.February.assignment4.self_problems.ecommerce_platform;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);

        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        customer.placeOrder(order1);

        System.out.println("Orders for " + customer + ":");
        customer.viewOrders();
    }
}