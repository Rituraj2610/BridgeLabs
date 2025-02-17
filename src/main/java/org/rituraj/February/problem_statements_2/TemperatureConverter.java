package org.rituraj.February.problem_statements_2;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1/2): ");
        int choice = sc.nextInt();

        double temperature;
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = sc.nextDouble();
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "°F is equal to " + celsius + "°C");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "°C is equal to " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
