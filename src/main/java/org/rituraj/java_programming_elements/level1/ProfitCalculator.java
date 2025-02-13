package org.rituraj.java_programming_elements.level1;

public class ProfitCalculator {
    public static void main(String[] args) {
        int costPrice = 129, sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit / (double) costPrice) * 100;
        System.out.printf(" The Cost Price is INR %d and Selling Price is INR %d The Profit is INR %d and the Profit Percentage is %.2f%%                ", costPrice, sellingPrice, profit, profitPercent);
    }
}

