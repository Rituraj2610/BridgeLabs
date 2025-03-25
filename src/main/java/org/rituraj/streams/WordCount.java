package org.rituraj.streams;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class WordCount {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.split("\\W+")) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        wordCount.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}

