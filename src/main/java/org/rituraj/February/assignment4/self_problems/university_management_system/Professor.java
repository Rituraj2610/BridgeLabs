package org.rituraj.February.assignment4.self_problems.university_management_system;

import java.util.ArrayList;

class Professor {
    private String name;
    private ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this);
    }

    @Override
    public String toString() {
        return "Professor: " + name;
    }}