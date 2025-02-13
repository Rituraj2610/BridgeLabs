package org.rituraj.February.assignment4.self_problems.university_management_system;

import java.util.ArrayList;

class Course {
    private String name;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Course: " + name + ", Professor: " + professor + ", Students: " + students;
    }
}