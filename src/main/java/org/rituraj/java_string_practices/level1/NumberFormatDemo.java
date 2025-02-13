package org.rituraj.java_string_practices.level1;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String str) {
        int number = Integer.parseInt(str);
    }

    public static void handleException(String str) {
        try {
            int number = Integer.parseInt(str);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        generateException(str);
        handleException(str);
    }
}
