package org.rituraj.February.problem_statements_1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        System.out.println("Enter date in dd/mm/yyyy format: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();

        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate modifiedDate = localDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);

        sc.close();
    }
}
