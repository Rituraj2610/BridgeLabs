package org.rituraj.February.assignment4.assisted_problems.company_and_departments;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dept1 = new Department("Engineering");
        dept1.addEmployee(new Employee("Alice"));
        dept1.addEmployee(new Employee("Bob"));

        Department dept2 = new Department("HR");
        dept2.addEmployee(new Employee("Charlie"));

        company.addDepartment(dept1);
        company.addDepartment(dept2);

        System.out.println(company);
    }
}
