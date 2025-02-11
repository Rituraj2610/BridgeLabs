package org.rituraj.February.Assignment5.MultilevelInheritence.OnlineRetailOrderManagement;

public class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(String orderDate, int orderId, String trackingNumber, String deliveryDate) {
        super(orderDate, orderId, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Delivered");
    }
}
