package org.rituraj.February.assignment4.self_problems.university_management_system;

import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}