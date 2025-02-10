package org.rituraj.February.Assignment2.Level1.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "A", "Software Engineer");
        Employee emp2 = new Employee(2, "B", "Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}


