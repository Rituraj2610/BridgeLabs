package org.rituraj.java_method_practices.level1;

import java.util.Scanner;

public class NumberChecker {
    public static int checkNumber(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = checkNumber(number);
        System.out.println("Result: " + result);
    }
}
