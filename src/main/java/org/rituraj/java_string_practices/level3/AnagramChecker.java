package org.rituraj.java_string_practices.level3;

import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) return false;

        int[] frequency = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
        }

        for (int i = 0; i < text2.length(); i++) {
            frequency[text2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String text1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String text2 = scanner.nextLine();

        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}