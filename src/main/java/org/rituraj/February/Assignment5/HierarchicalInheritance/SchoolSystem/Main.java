package org.rituraj.February.Assignment5.HierarchicalInheritance.SchoolSystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Clerk");

        System.out.println("Teacher Info:");
        teacher.displayInfo();
        teacher.displayRole();

        System.out.println("\nStudent Info:");
        student.displayInfo();
        student.displayRole();

        System.out.println("\nStaff Info:");
        staff.displayInfo();
        staff.displayRole();
    }

}

