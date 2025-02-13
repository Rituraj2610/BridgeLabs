package org.rituraj.February.assignment4.self_problems.university_with_faculties_and_departments;

import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println(department.getName());
        }
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            System.out.println(faculty.getName());
        }
    }
}