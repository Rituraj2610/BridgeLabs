package org.rituraj.java_string_practices.level2;

import java.util.Scanner;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 100);
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] eligibilityArray = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibilityArray[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                eligibilityArray[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                eligibilityArray[i][1] = "Can Vote";
            } else {
                eligibilityArray[i][1] = "Cannot Vote";
            }
        }
        return eligibilityArray;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tEligibility");
        System.out.println("---\t-----------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        int[] ages = generateAges(n);
        String[][] eligibilityArray = checkEligibility(ages);
        displayTable(eligibilityArray);
    }
}