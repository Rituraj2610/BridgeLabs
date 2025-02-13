package org.rituraj.February.assignment4.assisted_problems.bank_and_account_holders;
import java.util.HashMap;
class Customer {
    private String name;
    private HashMap<String, Double> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public void openAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    public void viewBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Balance for account " + accountNumber + ": " + accounts.get(accountNumber));
        } else {
            System.out.println("Account not found.");
        }
    }
}
