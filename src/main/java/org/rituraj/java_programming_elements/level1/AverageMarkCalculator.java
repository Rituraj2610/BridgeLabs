package org.rituraj.java_programming_elements.level1;

public class AverageMarkCalculator {
    public static void main(String[] args) {
        int math = 94, physics = 95, chemistry = 96;
        double average = (math + physics + chemistry) / 3.0;
        System.out.printf("Sam’s average mark in PCM is %.2f", average);
    }
}
