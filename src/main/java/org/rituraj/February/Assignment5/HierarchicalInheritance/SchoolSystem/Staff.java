package org.rituraj.February.Assignment5.HierarchicalInheritance.SchoolSystem;

public class Staff extends Person {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }
}

