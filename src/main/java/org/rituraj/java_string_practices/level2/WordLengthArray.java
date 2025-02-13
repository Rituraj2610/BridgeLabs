package org.rituraj.java_string_practices.level2;

import java.util.Scanner;

public class WordLengthArray {

    public static String[][] getWordsAndLengths(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);

        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(words[i].length());
        }

        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[][] wordsAndLengths = getWordsAndLengths(input);

        System.out.println("\nWords and their lengths:");
        for (String[] wordLength : wordsAndLengths) {
            System.out.println("Word: " + wordLength[0] + ", Length: " + wordLength[1]);
        }

        sc.close();
    }
}
