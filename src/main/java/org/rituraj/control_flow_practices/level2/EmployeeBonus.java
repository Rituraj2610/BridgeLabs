package org.rituraj.control_flow_practices.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus is: " + bonus);
        } else {
            System.out.println("No bonus since service is less than 5 years.");
        }
    }
}
