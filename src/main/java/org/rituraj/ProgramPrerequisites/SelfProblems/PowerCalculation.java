package org.rituraj.ProgramPrerequisites.SelfProblems;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + power);
        sc.close();
    }
}
