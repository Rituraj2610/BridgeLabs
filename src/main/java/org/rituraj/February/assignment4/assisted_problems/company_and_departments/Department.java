package org.rituraj.February.assignment4.assisted_problems.company_and_departments;

import java.util.ArrayList;

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Employees: " + employees;
    }
}
