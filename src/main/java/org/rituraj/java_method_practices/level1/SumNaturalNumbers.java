package org.rituraj.java_method_practices.level1;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of " + n + " natural numbers is: " + sum);
    }
}
