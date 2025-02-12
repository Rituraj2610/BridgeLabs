package org.rituraj.February.Assignment6.EmployeeManagementSystem;

public abstract class Employee {
    private int employeeId;
    private String name;
    private int baseSalary;

    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract void calculateSalary();

    public void displayDetails(){
        System.out.printf("ID: %d, Name: %s, Base Salary: %d%n", employeeId, name, baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
