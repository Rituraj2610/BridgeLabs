package org.rituraj.java_string_practices.level3;

import java.util.Scanner;

public class UniqueCharacters {

    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}