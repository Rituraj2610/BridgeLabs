package org.rituraj.java_method_practices.level1;

import java.util.Scanner;

public class TrigonometricFunctionsCalculator {
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.2f, Cosine: %.2f, Tangent: %.2f%n", results[0], results[1], results[2]);
    }
}
