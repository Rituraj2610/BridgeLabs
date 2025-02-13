package org.rituraj.java_method_practices.level3;

import java.util.Random;

public class FootballTeamStatistics {

    static int[] heights = new int[11];

    public static void generateHeights() {
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }
    }

    public static int sumHeights(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    public static double meanHeight(int[] arr) {
        return (double) sumHeights(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int shortest = arr[0];
        for (int height : arr) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] arr) {
        int tallest = arr[0];
        for (int height : arr) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        generateHeights();

        System.out.println("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nTotal Height: " + sumHeights(heights));
        System.out.println("Mean Height: " + meanHeight(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}

