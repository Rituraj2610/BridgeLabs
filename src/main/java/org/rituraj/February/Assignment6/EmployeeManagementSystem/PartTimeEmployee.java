package org.rituraj.February.Assignment6.EmployeeManagementSystem;

public class PartTimeEmployee extends Employee{
    private int workHours;

    public PartTimeEmployee(int employeeId, String name, int baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    void calculateSalary() {
        System.out.println(workHours * getBaseSalary());
    }
}
