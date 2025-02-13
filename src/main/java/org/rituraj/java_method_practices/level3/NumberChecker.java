package org.rituraj.java_method_practices.level3;

public class NumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0");
    }

    public static boolean isArmstrongNumber(int num) {
        int[] digits = getDigits(num);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digits.length);
        }
        return sum == num;
    }

    public static int findLargestDigit(int[] digits) {
        int largest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                largest = digit;
            }
        }
        return largest;
    }

    public static int findSecondLargestDigit(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int num = 153;

        System.out.println("Number: " + num);
        System.out.println("Count of Digits: " + countDigits(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(num));

        int[] digits = getDigits(num);
        System.out.println("Largest Digit: " + findLargestDigit(digits));
        System.out.println("Second Largest Digit: " + findSecondLargestDigit(digits));
    }
}
