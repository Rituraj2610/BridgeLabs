package org.rituraj.February.problem_statements_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int input = getInput();

        int value = factorialCalculator(input);
        displayResult(value, input);
    }


    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }


    public static int factorialCalculator(int n) {
        if(n == 1){
            return 1;
        }

        return n * factorialCalculator(n-1);
    }


    public static void displayResult(int value, int n) {
        System.out.printf("Factorial of %d is %d", n, value);
    }

}


