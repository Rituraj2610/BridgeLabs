package org.rituraj.February.Assignment5.MultilevelInheritence.EducationalCourseHierarchy;

public class Course {
        private String courseName;
        private int duration;

        public Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public void displayDetails() {
            System.out.println("Course Name: " + courseName);
            System.out.println("Duration: " + duration + " hours");
        }

}
