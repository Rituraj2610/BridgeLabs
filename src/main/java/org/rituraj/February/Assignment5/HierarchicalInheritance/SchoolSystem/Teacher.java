package org.rituraj.February.Assignment5.HierarchicalInheritance.SchoolSystem;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}

