package org.rituraj.java_programming_elements.level1;
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        double heightInInches = heightCm / 2.54;
        int feet = (int) (heightInInches / 12);
        double inches = heightInInches % 12;
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f", heightCm, feet, inches);
    }
}
