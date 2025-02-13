package org.rituraj.arrays_practices.level2;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
            marks[i][2] = sc.nextInt();

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 3.0);

            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        System.out.println("Marks\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\t%.2f\t%s\n", marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}

