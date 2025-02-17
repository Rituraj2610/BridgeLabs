package org.rituraj.February.problem_statements_2;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 3 distinct integers: ");
        int n1 = input();
        int n2 = input();
        int n3 = input();

        System.out.println(compare(n1, n2, n3) + " is the largest");
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int compare(int n1, int n2, int n3){
        if(n1 > n3 && n1 > n2){
            return n1;
        } else if (n2 > n3 && n2 > n1) {
            return n2;
        }else{
            return n3;
        }
    }
}
