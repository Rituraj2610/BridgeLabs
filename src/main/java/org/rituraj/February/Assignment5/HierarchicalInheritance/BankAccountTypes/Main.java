package org.rituraj.February.Assignment5.HierarchicalInheritance.BankAccountTypes;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new CheckingAccount(1, 12, 2);
        bankAccount.displayDetails();

        BankAccount bankAccount1 = new SavingsAccount(1, 12, 2);
        bankAccount1.displayDetails();
    }
}
