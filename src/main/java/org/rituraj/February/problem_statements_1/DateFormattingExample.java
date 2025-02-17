package org.rituraj.February.problem_statements_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }
}
