package org.rituraj.February.Assignment5.AssistedProblems.EmployeeManagementSystem;

public class Manager extends Employee{
    private int teamSize;

    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.printf("TeamSize: %d", teamSize);
    }

    public int getTeamSize() {
        return teamSize;
    }
}
