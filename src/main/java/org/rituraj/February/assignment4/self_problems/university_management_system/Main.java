package org.rituraj.February.assignment4.self_problems.university_management_system;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Professor professor = new Professor("Dr. Smith");

        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Mathematics");

        professor.assignCourse(course1);
        professor.assignCourse(course2);

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);

        System.out.println(course1);
        System.out.println(course2);
    }
}