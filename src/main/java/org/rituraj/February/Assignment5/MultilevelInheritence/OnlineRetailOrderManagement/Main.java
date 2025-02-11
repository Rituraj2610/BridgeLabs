package org.rituraj.February.Assignment5.MultilevelInheritence.OnlineRetailOrderManagement;

public class Main {
    public static void main(String[] args) {
        Order shiped = new ShippedOrder("11-11-11", 12, "a-1-2-a");
        shiped.getOrderStatus();
    Order delivered = new DeliveredOrder("11-11-11", 12, "a-1-2-a", "12-12-12");
        delivered.getOrderStatus();
    }
}
