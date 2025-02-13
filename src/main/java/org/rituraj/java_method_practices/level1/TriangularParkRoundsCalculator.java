package org.rituraj.java_method_practices.level1;

import java.util.Scanner;

public class TriangularParkRoundsCalculator {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The number of rounds needed is: " + rounds);
    }
}
