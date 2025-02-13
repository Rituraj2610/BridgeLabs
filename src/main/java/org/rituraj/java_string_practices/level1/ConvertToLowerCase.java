package org.rituraj.java_string_practices.level1;

import java.util.Scanner;

public class ConvertToLowerCase {
    public static String toLowerCaseUsingCharAt(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
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

        String customLower = toLowerCaseUsingCharAt(str);
        String builtinLower = str.toLowerCase();

        System.out.println("Custom Lowercase: " + customLower);
        System.out.println("Builtin Lowercase: " + builtinLower);
        System.out.println("Are both results equal? " + customLower.equals(builtinLower));
    }
}
