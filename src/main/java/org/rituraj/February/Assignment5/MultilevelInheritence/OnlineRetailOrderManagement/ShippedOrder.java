package org.rituraj.February.Assignment5.MultilevelInheritence.OnlineRetailOrderManagement;

public class ShippedOrder extends Order{
    private String trackingNumber;

    public ShippedOrder(String orderDate, int orderId, String trackingNumber) {
        super(orderDate, orderId);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus(){
        System.out.println("Shipped");
    }
}
