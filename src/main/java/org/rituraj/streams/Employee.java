package org.rituraj.streams;

import java.io.Serializable;

class Employee implements Serializable {
    int id;
    String name, department;
    double salary;
    Employee(int id, String name, String dept, double sal) {
        this.id = id; this.name = name; this.department = dept; this.salary = sal;
    }
}