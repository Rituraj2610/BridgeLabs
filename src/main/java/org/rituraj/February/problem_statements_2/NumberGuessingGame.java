package org.rituraj.February.problem_statements_2;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number you are thinking!! \n\n");

        int min = 1;
        int max = 100;
        int val = possibleNumber(min, max);

        calculator(val, sc, min, max);
    }

    public static int possibleNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void calculator(int val, Scanner sc, int min, int max){
        while (true){
            System.out.printf("Is %d the number?%n%n", val);

            System.out.println("Type \"High\" if your number is above the guessed number," +
                    " \n\"Low\" if your number is above the guessed number" +
                    " \nor \"Equal\" is the number guessed is correct");

            String str = sc.nextLine();

            switch (str){
                case "High" :
                    min = val + 1;
                    if (min > max) {
                        System.out.println("Error: Your feedback is inconsistent!");
                        return;
                    }
                    val = possibleNumber(min, max);
                    break;
                case "Low" :
                    max = val-1;
                    if (min > max) {
                        System.out.println("Error: Your feedback is inconsistent!");
                        return;
                    }
                    val = possibleNumber(min, max);
                    break;
                case "Equal" :
                    System.out.println("You were thinking of " + val);
                    return;
                default:
                    System.out.println("Invalid input. Please type \"High\", \"Low\", or \"Equal\".");
            }
        }
    }
}
