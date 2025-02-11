package org.rituraj.February.Assignment5.MultilevelInheritence.OnlineRetailOrderManagement;

public class Order {
    private int orderId;
    private String orderDate;

    public Order(String orderDate, int orderId) {
        this.orderDate = orderDate;
        this.orderId = orderId;
    }

    void getOrderStatus(){
//        System.out.println("Shipped");
    }
}
