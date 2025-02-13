package org.rituraj.java_method_practices.level2;

import java.util.Scanner;

public class FactorialCalculator {
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorialIter = factorialIterative(n);
        long factorialRec = factorialRecursive(n);

        System.out.println("Factorial (Iterative): " + factorialIter);
        System.out.println("Factorial (Recursive): " + factorialRec);
        System.out.println("Results are " + (factorialIter == factorialRec ? "equal" : "not equal"));
    }
}
