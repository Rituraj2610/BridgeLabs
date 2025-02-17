package org.rituraj.February.strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder toggled = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) toggled.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) toggled.append(Character.toUpperCase(ch));
            else toggled.append(ch);
        }
        System.out.println("Toggled string: " + toggled);
    }
}
