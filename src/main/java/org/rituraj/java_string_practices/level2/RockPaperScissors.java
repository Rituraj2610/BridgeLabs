package org.rituraj.java_string_practices.level2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "";
        }
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "User Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);

        double userWinPercentage = (double) userWins / totalGames * 100;
        double computerWinPercentage = (double) computerWins / totalGames * 100;

        stats[0][1] += " (" + String.format("%.2f", userWinPercentage) + "%)";
        stats[1][1] += " (" + String.format("%.2f", computerWinPercentage) + "%)";

        return stats;
    }

    // Method to display results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Outcome\t\tCount");
        System.out.println("-------\t\t-----");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of games:");
        int totalGames = scanner.nextInt();

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.println("Enter your choice (Rock, Paper, Scissors):");
            String userChoice = scanner.next();
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            if (result.equals("User Wins")) {
                userWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            }
        }

        String[][] stats = calculateStats(userWins, computerWins, totalGames);
        displayResults(stats);
    }
}