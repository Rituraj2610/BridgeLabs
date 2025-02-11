package org.rituraj.February.Assignment5.HybridInheritance.RestaurantManagementSystem;

public class Waiter extends Person implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Serving food and drinks to " + tableCount + " tables.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of tables served: " + tableCount);
    }
}

