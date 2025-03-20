package org.rituraj.generics.multi_level_university_course_management_system;

// Research-based course
class ResearchCourse extends CourseType {
    private String researchTopic;
    private String thesisSubmissionDate;

    public ResearchCourse(String courseName, String courseCode, int credits, String researchTopic, String thesisSubmissionDate) {
        super(courseName, courseCode, credits);
        this.researchTopic = researchTopic;
        this.thesisSubmissionDate = thesisSubmissionDate;
    }

    @Override
    public String toString() {
        return super.toString() + " [Research Topic: " + researchTopic + ", Thesis Submission: " + thesisSubmissionDate + "]";
    }
}