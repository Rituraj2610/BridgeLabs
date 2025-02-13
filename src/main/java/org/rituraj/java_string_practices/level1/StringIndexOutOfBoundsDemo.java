package org.rituraj.java_string_practices.level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length() + 1));
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
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
