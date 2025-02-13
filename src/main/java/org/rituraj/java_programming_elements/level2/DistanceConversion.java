package org.rituraj.java_programming_elements.level2;

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("Distance in yards: " + distanceInYards + ", distance in miles: " + distanceInMiles);
    }
}
