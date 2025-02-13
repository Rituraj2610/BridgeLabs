package org.rituraj.java_string_practices.level2;

import java.util.Scanner;

public class CharacterTypeDisplay {

    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] createCharacterTypeArray(String text) {
        String[][] characterTypeArray = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            characterTypeArray[i][0] = String.valueOf(text.charAt(i));
            characterTypeArray[i][1] = checkCharacterType(text.charAt(i));
        }
        return characterTypeArray;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        System.out.println("---------\t----");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        String[][] characterTypeArray = createCharacterTypeArray(text);
        displayTable(characterTypeArray);
    }
}