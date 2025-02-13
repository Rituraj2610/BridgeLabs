package org.rituraj.java_string_practices.level1;

import java.util.Scanner;

public class SubstringComparison {
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String customSubstring = substringUsingCharAt(str, start, end);
        String builtinSubstring = str.substring(start, end);

        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);
        System.out.println("Are both substrings equal? " + customSubstring.equals(builtinSubstring));
    }
}
