package org.rituraj.regex.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        String regex = "(?=[A-Z]{2})[A-Z]{2}[\\d]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);


        System.out.println((matcher.matches()) ? "Valid" : "Invalid");

    }
}