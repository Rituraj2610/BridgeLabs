package org.rituraj.February.strings;

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);

        String result = input.replace(String.valueOf(toRemove), "");
        System.out.println("Modified string: " + result);
    }
}
