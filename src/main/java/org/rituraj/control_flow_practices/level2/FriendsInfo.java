package org.rituraj.control_flow_practices.level2;

import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        System.out.println("The youngest age is: " + youngestAge);

        System.out.print("Enter Amar's height: ");
        int heightAmar = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = scanner.nextInt();

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        System.out.println("The tallest height is: " + tallestHeight);
    }
}
