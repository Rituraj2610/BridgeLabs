package org.rituraj.java_method_practices.level3;

import java.util.Random;

public class BonusCalculation {

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonusAndNewSalaries(employeeData);
        displayBonusDetails(employeeData, updatedData);
    }

    static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 30000 + random.nextInt(20001);
            data[i][1] = random.nextInt(11);
        }
        return data;
    }

    static double[][] calculateBonusAndNewSalaries(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            double bonusRate = employeeData[i][1] > 5 ? 0.05 : 0.02;
            double bonus = employeeData[i][0] * bonusRate;
            double newSalary = employeeData[i][0] + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    static void displayBonusDetails(int[][] employeeData, double[][] updatedData) {
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Salary", "Years", "Bonus", "New Salary");
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%-10d %-10d %-10.2f %-10.2f\n", employeeData[i][0], employeeData[i][1], updatedData[i][0], updatedData[i][1]);
            totalOldSalary += employeeData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][0];
        }
        System.out.printf("\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus: %.2f\n", totalOldSalary, totalNewSalary, totalBonus);
    }
}
