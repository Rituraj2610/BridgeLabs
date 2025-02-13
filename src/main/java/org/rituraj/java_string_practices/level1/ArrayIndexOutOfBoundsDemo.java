package org.rituraj.java_string_practices.level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] array) {
        System.out.println(array[array.length + 1]);
    }

    public static void handleException(String[] array) {
        try {
            System.out.println(array[array.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        generateException(names);
        handleException(names);
    }
}
