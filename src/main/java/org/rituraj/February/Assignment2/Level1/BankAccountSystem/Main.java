package org.rituraj.February.Assignment2.Level1.BankAccountSystem;

// Main class to test the BankAccount class
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "A", 500000);
        BankAccount acc2 = new BankAccount(102, "B", 300000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
