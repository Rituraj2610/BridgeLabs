package org.rituraj.February.strings;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        String newWord = scanner.nextLine();

        String modified = sentence.replace(oldWord, newWord);
        System.out.println("Modified sentence: " + modified);
    }
}
