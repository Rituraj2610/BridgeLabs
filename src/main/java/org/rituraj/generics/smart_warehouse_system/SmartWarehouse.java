package org.rituraj.generics.smart_warehouse_system;

public class SmartWarehouse {
    public static void main(String[] args) {
        // Sample Data
        // Object for Storage of type Electronic
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.storeItems(new Electronics("Laptop", 75000, "Dell", 24));
        electronicsStorage.storeItems(new Electronics("Television", 60000, "Sony", 36));

        // Object for Storage of type Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.storeItems(new Groceries("Milk", 50, "2025-04-15", 1.0));
        groceriesStorage.storeItems(new Groceries("Bread", 40, "2025-03-10", 0.5));

        // Object for Storage of type Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.storeItems(new Furniture("Office Chair", 5000, "Mesh", "2x2 ft"));
        furnitureStorage.storeItems(new Furniture("King Size Bed", 25000, "Wood", "6x6 ft"));

        // Display all items using wildcard method
        System.out.println("Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getItem());

        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceriesStorage.getItem());

        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getItem());

    }
}
