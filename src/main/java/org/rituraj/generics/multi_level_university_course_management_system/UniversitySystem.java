package org.rituraj.generics.multi_level_university_course_management_system;

import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
    public static void main(String[] args) {
        // Creating different types of courses
        ExamCourse mathExam = new ExamCourse("Mathematics", "MATH101", 4, 70.0, "2024-12-15");
        AssignmentCourse programmingAssignment = new AssignmentCourse("Java Programming", "CS201", 3, 5, 60.0);
        ResearchCourse aiResearch = new ResearchCourse("AI Research", "AI301", 5, "Deep Learning", "2025-06-10");

        // Creating generic Course instances
        Course<ExamCourse> mathCourse = new Course<>(mathExam, "Dr. Smith");
        Course<AssignmentCourse> javaCourse = new Course<>(programmingAssignment, "Prof. Johnson");
        Course<ResearchCourse> aiCourse = new Course<>(aiResearch, "Dr. White");

        // Adding students
        mathCourse.addStudent("Alice");
        mathCourse.addStudent("Bob");

        javaCourse.addStudent("Charlie");
        javaCourse.addStudent("David");

        aiCourse.addStudent("Eve");

        // Storing courses in a list
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(mathExam);
        allCourses.add(programmingAssignment);
        allCourses.add(aiResearch);

        // Displaying courses
        System.out.println("Available Courses:");
        UniversityCourseManager.displayCourses(allCourses);

        // Displaying course details
        System.out.println("\nDetailed Course Information:");
        System.out.println(mathCourse);
        System.out.println();
        System.out.println(javaCourse);
        System.out.println();
        System.out.println(aiCourse);
    }
}
