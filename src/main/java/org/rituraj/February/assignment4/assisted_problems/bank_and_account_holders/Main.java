package org.rituraj.February.assignment4.assisted_problems.bank_and_account_holders;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Doe");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        bank.openAccount(customer1, "12345", 1000.0);
        bank.openAccount(customer2, "67890", 2000.0);

        customer1.viewBalance("12345");
        customer2.viewBalance("67890");
    }
}
