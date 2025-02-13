package org.rituraj.arrays_practices.level1;

import java.util.Scanner;

public class StoreAndSumNumbers {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            if (num <= 0 || index == 10) break;
            numbers[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println("Number at position " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("Sum of all numbers: " + total);
        scanner.close();
    }
}
