package org.rituraj.generics.multi_level_university_course_management_system;

// Abstract class representing a general course type
abstract class CourseType {
    private String courseName;
    private String courseCode;
    private int credits;

    public CourseType(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return courseName + " (" + courseCode + ") - " + credits + " credits";
    }
}
