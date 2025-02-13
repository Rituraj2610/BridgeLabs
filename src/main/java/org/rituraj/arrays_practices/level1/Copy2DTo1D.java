package org.rituraj.arrays_practices.level1;

import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                array[index++] = matrix[i][j];
            }
        }

        System.out.print("1D array: ");
        for (int num : array) System.out.print(num + " ");
        System.out.println();

        scanner.close();
    }
}
