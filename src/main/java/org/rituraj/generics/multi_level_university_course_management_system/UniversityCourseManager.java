package org.rituraj.generics.multi_level_university_course_management_system;

import java.util.List;

// University Course Manager to manage courses dynamically
class UniversityCourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}
