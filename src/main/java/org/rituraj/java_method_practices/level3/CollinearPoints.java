package org.rituraj.java_method_practices.level3;

import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.print("Enter x3, y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        boolean areCollinear = checkCollinearity(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear? " + (areCollinear ? "Yes" : "No"));
    }

    static boolean checkCollinearity(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
