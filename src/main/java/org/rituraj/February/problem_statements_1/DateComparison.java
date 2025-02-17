package org.rituraj.February.problem_statements_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first date in format dd-MM-yyyy");
        String date1 = sc.nextLine();
        System.out.println("Enter second date in format dd-MM-yyyy");
        String date2 = sc.nextLine();

        LocalDate localDate1 = LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        LocalDate localDate2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        if(localDate1.isAfter(localDate2)){
            System.out.println("First date is after second one");
        }else if(localDate1.isBefore(localDate2)){
            System.out.println("First date is before second one");
        } else if (localDate1.isEqual(localDate2)) {
            System.out.println("First date is equal to second one");

        }
    }
}
