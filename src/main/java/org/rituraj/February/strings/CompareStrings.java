package org.rituraj.February.strings;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        int comparison = str1.compareTo(str2);
        if (comparison < 0) System.out.println(str1 + " comes before " + str2);
        else if (comparison > 0) System.out.println(str1 + " comes after " + str2);
        else System.out.println("The strings are equal.");
    }
}
