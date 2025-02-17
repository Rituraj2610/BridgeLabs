package org.rituraj.February.problem_statements_2;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = getInput();

        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }


    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        return sc.nextLine().trim().toLowerCase();  // Normalize to lowercase for case-insensitive comparison
    }


    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}

