package org.rituraj.java_string_practices.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String str) {
        System.out.println(str.substring(5, 2));
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
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
