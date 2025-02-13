package org.rituraj.February.assignment4.self_problems.school_and_students_with_courses;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

