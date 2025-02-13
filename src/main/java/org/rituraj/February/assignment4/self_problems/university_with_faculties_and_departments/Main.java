package org.rituraj.February.assignment4.self_problems.university_with_faculties_and_departments;

public class Main {
    public static void main(String[] args) {
        University university = new University("XYZ University");

        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");

        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        university.showDetails();
    }
}