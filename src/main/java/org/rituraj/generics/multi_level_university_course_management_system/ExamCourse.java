package org.rituraj.generics.multi_level_university_course_management_system;

// Exam-based course
class ExamCourse extends CourseType {
    private double examWeightage;
    private String examDate;

    public ExamCourse(String courseName, String courseCode, int credits, double examWeightage, String examDate) {
        super(courseName, courseCode, credits);
        this.examWeightage = examWeightage;
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return super.toString() + " [Exam Weightage: " + examWeightage + "%, Exam Date: " + examDate + "]";
    }
}