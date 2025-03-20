package org.rituraj.generics.multi_level_university_course_management_system;

import java.util.ArrayList;
import java.util.List;

// Generic Course class to store different types of courses
class Course<T extends CourseType> {
    private T courseDetails;
    private String instructor;
    private List<String> studentsEnrolled;

    public Course(T courseDetails, String instructor) {
        this.courseDetails = courseDetails;
        this.instructor = instructor;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void addStudent(String student) {
        studentsEnrolled.add(student);
    }

    public void removeStudent(String student) {
        studentsEnrolled.remove(student);
    }

    public T getCourseDetails() {
        return courseDetails;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Course: " + courseDetails + "\nInstructor: " + instructor + "\nStudents Enrolled: " + studentsEnrolled;
    }
}