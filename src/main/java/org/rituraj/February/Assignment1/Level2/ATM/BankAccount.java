package org.rituraj.February.Assignment1.Level2.ATM;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John", 12345, 1000);
        account.deposit(500);
        account.withdraw(300);
        account.displayBalance();
    }
}
