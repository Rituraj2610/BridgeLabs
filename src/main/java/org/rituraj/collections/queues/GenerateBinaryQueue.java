package org.rituraj.collections.queues;

import java.util.*;

public class GenerateBinaryQueue {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < N; i++) {
            String binary = queue.poll();
            result.add(binary);
            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Binary Numbers: " + generateBinaryNumbers(N));
    }
}