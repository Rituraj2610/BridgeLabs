package org.rituraj.February.assignment4.self_problems.school_and_students_with_courses;

import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
