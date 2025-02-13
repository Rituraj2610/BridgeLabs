package org.rituraj.java_string_practices.level2;

import java.util.Scanner;

public class StringTrimmer {

    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String text = scanner.nextLine();

        int[] indices = trimSpaces(text);
        String trimmedText = createSubstring(text, indices[0], indices[1]);

        String builtInTrimmedText = text.trim();
        boolean areEqual = compareStrings(trimmedText, builtInTrimmedText);

        System.out.println("Trimmed Text: \"" + trimmedText + "\"");
        System.out.println("Built-in Trimmed Text: \"" + builtInTrimmedText + "\"");
        System.out.println("Are they equal? " + areEqual);
    }
}