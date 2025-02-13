package org.rituraj.java_string_practices.level2;

import java.util.Scanner;

public class StringSplitter {

    public static String[] splitString(String text) {
        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        words[index] = text.substring(start);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customSplit = splitString(input);

        String[] builtInSplit = input.split(" ");

        boolean areEqual = compareArrays(customSplit, builtInSplit);

        System.out.println("Words using custom split method:");
        for (String word : customSplit) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nWords using built-in split() method:");
        for (String word : builtInSplit) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nComparison result: " + (areEqual ? "Both methods produce the same result" : "Results are different"));

        sc.close();
    }
}
