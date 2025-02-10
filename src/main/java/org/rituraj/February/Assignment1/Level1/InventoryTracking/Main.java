package org.rituraj.February.Assignment1.Level1.InventoryTracking;

public class Main {
    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 800);
        item.displayDetails();
        System.out.println("Total Cost for 3 items: $" + item.calculateTotalCost(3));
    }
}
