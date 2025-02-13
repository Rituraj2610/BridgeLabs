package org.rituraj.February.assignment4.assisted_problems.bank_and_account_holders;


import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, String accountNumber, double initialBalance) {
        customer.openAccount(accountNumber, initialBalance);
    }
}