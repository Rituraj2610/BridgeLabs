package org.rituraj.java_method_practices.level1;

import java.util.Scanner;

public class ChocolateDistributor {
    public static int[] distributeChocolates(int chocolates, int children) {
        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        int[] result = distributeChocolates(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates. Remaining: " + result[1]);
    }
}
