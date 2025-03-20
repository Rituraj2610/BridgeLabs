package org.rituraj.generics.multi_level_university_course_management_system;

// Assignment-based course
class AssignmentCourse extends CourseType {
    private int numberOfAssignments;
    private double assignmentWeightage;

    public AssignmentCourse(String courseName, String courseCode, int credits, int numberOfAssignments, double assignmentWeightage) {
        super(courseName, courseCode, credits);
        this.numberOfAssignments = numberOfAssignments;
        this.assignmentWeightage = assignmentWeightage;
    }

    @Override
    public String toString() {
        return super.toString() + " [Assignments: " + numberOfAssignments + ", Assignment Weightage: " + assignmentWeightage + "%]";
    }
}