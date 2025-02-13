package org.rituraj.java_method_practices.level2;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumUsingRecursion(int n) {
        if (n == 1) return 1;
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            return;
        }

        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursion == sumFormula) {
            System.out.println("Both sums match.");
        } else {
            System.out.println("There is a mismatch.");
        }
    }
}
