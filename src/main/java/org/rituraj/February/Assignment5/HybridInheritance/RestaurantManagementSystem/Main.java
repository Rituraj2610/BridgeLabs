package org.rituraj.February.Assignment5.HybridInheritance.RestaurantManagementSystem;

public class Main {
       public static void main(String[] args) {
            Chef chef = new Chef("Gordon Ramsay", 101, "Italian cuisine");
            Waiter waiter = new Waiter("Jane Doe", 202, 5);

            System.out.println("Chef Info:");
            chef.displayInfo();
            chef.performDuties();

            System.out.println("\nWaiter Info:");
            waiter.displayInfo();
            waiter.performDuties();
        }
}
