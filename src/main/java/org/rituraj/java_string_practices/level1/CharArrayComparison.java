package org.rituraj.java_string_practices.level1;

import java.util.Scanner;

public class CharArrayComparison {
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        char[] customChars = getCharacters(str);
        char[] builtinChars = str.toCharArray();

        System.out.println("Comparison result: " + compareCharArrays(customChars, builtinChars));
    }
}
