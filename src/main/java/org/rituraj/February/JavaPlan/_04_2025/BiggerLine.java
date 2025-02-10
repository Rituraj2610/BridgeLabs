package org.rituraj.February.JavaPlan._04_2025;

import java.util.Scanner;

public class BiggerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first line coordinates: ");
        System.out.println("X1: ");
        int x1 = sc.nextInt();

        System.out.println("Y1: ");
        int y1 = sc.nextInt();

        System.out.println("X2: ");
        int x2 = sc.nextInt();

        System.out.println("Y2: ");
        int y2 = sc.nextInt();

        System.out.println("Enter second line coordinates: ");
        System.out.println("X3: ");
        int x3 = sc.nextInt();

        System.out.println("Y3: ");
        int y3 = sc.nextInt();

        System.out.println("X4: ");
        int x4 = sc.nextInt();

        System.out.println("Y4: ");
        int y4 = sc.nextInt();

        compute(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public static void compute(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        int l1 = calcLength(x1, y1, x2, y2);
        int l2 = calcLength(x3, y3, x4, y4);

        if(l1>l2){
            System.out.println("First Line is greater with length " + l1);
        }else{
            System.out.println("Second Line is greater with length " + l2);
        }
    }

    public static int calcLength(int x1, int y1, int x2, int y2){
        return (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }
}