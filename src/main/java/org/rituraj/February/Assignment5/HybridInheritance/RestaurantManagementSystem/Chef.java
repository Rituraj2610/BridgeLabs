package org.rituraj.February.Assignment5.HybridInheritance.RestaurantManagementSystem;

public class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Preparing and cooking dishes, especially: " + specialty);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialty: " + specialty);
    }
}
