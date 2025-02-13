package org.rituraj.java_string_practices.level1;

import java.util.Scanner;

public class ConvertToUpperCase {
    public static String toUpperCaseUsingCharAt(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String customUpper = toUpperCaseUsingCharAt(str);
        String builtinUpper = str.toUpperCase();

        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Builtin Uppercase: " + builtinUpper);
        System.out.println("Are both results equal? " + customUpper.equals(builtinUpper));
    }
}
