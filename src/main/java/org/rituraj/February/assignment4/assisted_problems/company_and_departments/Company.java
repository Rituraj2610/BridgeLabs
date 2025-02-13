package org.rituraj.February.assignment4.assisted_problems.company_and_departments;

import java.util.ArrayList;

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return "Company: " + name + ", Departments: " + departments;
    }
}
