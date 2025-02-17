package org.rituraj.February.problem_statements_2;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = input();

        if(isPrime(n)){
            System.out.printf("%d is prime number.", n);
        }else{
            System.out.printf("%d is not prime number.", n);
        }
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static boolean isPrime(int n){
        if(n == 1 || (n%2 ==0)){
            return false;
        }

        if(n==3) return true;


        for(int i = 3; i <= (int)Math.sqrt(n); i+=2){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
