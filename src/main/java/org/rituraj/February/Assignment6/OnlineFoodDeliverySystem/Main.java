package org.rituraj.February.Assignment6.OnlineFoodDeliverySystem;

public class Main {
    public static void processOrder(FoodItem foodItem) {
        System.out.println(foodItem.getItemDetails());
        System.out.println("Total Price: $" + foodItem.calculateTotalPrice());
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Burger", 5.0, 2);
        ((VegItem) vegItem).applyDiscount(10);
        processOrder(vegItem);

        FoodItem nonVegItem = new NonVegItem("Chicken Wings", 7.0, 3);
        ((NonVegItem) nonVegItem).applyDiscount(5);
        processOrder(nonVegItem);
    }
}