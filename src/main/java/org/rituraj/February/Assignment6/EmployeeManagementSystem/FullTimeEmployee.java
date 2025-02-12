package org.rituraj.February.Assignment6.EmployeeManagementSystem;

public class FullTimeEmployee extends Employee{
    private int workHours;

    public FullTimeEmployee(int employeeId, String name, int baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    void calculateSalary() {
        System.out.println(workHours * getBaseSalary());
    }
}
