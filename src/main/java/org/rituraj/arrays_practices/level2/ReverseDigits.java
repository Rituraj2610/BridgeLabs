package org.rituraj.arrays_practices.level2;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
