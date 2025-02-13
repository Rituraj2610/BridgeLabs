package org.rituraj.java_method_practices.level2;

import java.util.Scanner;

public class FactorCalculator {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    public static double sumOfSquareFactors(int[] factors) {
        double sumSquare = 0;
        for (int factor : factors) sumSquare += Math.pow(factor, 2);
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.println("Factors: ");
        for (int factor : factors) System.out.print(factor + " ");

        System.out.println("\nSum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Sum of square of factors: " + sumOfSquareFactors(factors));
    }
}
