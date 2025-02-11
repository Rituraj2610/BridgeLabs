package org.rituraj.February.Assignment5.MultilevelInheritence.EducationalCourseHierarchy;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("Introduction to Programming", 30);
        System.out.println("Course Details:");
        course.displayDetails();
        System.out.println();


        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 40, "Udemy", true);
        System.out.println("Online Course Details:");
        onlineCourse.displayDetails();
        System.out.println();

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 50, "Coursera", true, 200.0, 10.0);
        System.out.println("Paid Online Course Details:");
        paidOnlineCourse.displayDetails();
    }
}