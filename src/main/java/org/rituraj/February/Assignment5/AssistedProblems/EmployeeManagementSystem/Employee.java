package org.rituraj.February.Assignment5.AssistedProblems.EmployeeManagementSystem;

public class Employee {
    private String name;
    private int id;
    private int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.printf("Name: %s, ID: %d, Salary: %d", name, id, salary);
    }
}
