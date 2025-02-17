package org.rituraj.February.problem_statements_2;

import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numTerms = input();

        if (numTerms <= 0) {
            System.out.println("Please enter a positive number greater than zero.");
            return;
        }

        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + (i < numTerms - 1 ? ", " : ""));
        }
    }

    public static int fibonacci(int i){
        if(i==0) {
            return 0;
        }else if(i==1){
            return 1;
        }else{
            return fibonacci(i-1) + fibonacci(i-2);
        }


    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
