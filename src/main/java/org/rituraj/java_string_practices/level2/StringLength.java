package org.rituraj.java_string_practices.level2;

import java.util.Scanner;

public class StringLength {
    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findLength(input);

        int builtInLength = input.length();

        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
