package org.rituraj.java_method_practices.level2;

import java.util.Scanner;

public class UnitConverter {
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in meters: ");
        double meters = scanner.nextDouble();

        double feet = metersToFeet(meters);
        double inches = metersToInches(meters);

        System.out.println(meters + " meters is equal to " + feet + " feet.");
        System.out.println(meters + " meters is equal to " + inches + " inches.");
    }
}
