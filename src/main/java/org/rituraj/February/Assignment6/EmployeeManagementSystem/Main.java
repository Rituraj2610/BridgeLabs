package org.rituraj.February.Assignment6.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee employee = new FullTimeEmployee(1, "A", 1000, 10);
        employee.displayDetails();
        employee.calculateSalary();
    }
}
