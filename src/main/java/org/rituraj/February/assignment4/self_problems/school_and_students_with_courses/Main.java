package org.rituraj.February.assignment4.self_problems.school_and_students_with_courses;

public class Main {
    public static void main(String[] args) {
        School school = new School("ABC High School");

        Student student1 = new Student("John");
        Student student2 = new Student("Emma");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        school.addStudent(student1);
        school.addStudent(student2);

        student1.enroll(math);
        student1.enroll(science);
        student2.enroll(math);

        student1.viewCourses();
        student2.viewCourses();
        math.showEnrolledStudents();
        school.showStudents();
    }
}