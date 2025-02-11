package org.rituraj.February.Assignment5.HierarchicalInheritance.SchoolSystem;

public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }
}

