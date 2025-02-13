package org.rituraj.java_programming_elements.level2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle (cm): ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle (cm): ");
        double height = input.nextDouble();

        double areaInSqCm = 0.5 * base * height;
        double areaInSqInches = areaInSqCm / 6.4516;

        System.out.println("Area of the triangle: " + areaInSqCm + " cm² and " + areaInSqInches + " inches².");
    }
}
