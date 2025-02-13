package org.rituraj.java_string_practices.level2;

import java.util.Scanner;

public class TextProcessor {

    public static String[] splitText(String text) {
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            words[index] = word.toString();
        }
        return words;
    }

    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengthArray;
    }
    public static int[] findShortestLongest(String[][] wordLengthArray) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = 0;
        for (String[] word : wordLengthArray) {
            int length = Integer.parseInt(word[1]);
            if (length < shortestLength) {
                shortestLength = length;
            }
            if (length > longestLength) {
                longestLength = length;
            }
        }
        return new int[]{shortestLength, longestLength};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordLengthArray = createWordLengthArray(words);
        int[] shortestLongest = findShortestLongest(wordLengthArray);

        System.out.println("Shortest word length: " + shortestLongest[0]);
        System.out.println("Longest word length: " + shortestLongest[1]);
    }
}