package org.rituraj.February.Assignment5.AssistedProblems.EmployeeManagementSystem;

public class Developer extends Employee{

    private String lang;
    Developer(String name, int id, int salary, String lang) {
        super(name, id, salary);
        this.lang = lang;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.printf("Lang: %s", lang);
    }
}
