package org.rituraj.arrays_practices.level1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is positive");
                if (num % 2 == 0) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last numbers are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first number is greater than the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
