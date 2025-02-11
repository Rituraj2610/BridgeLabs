package org.rituraj.February.Assignment5.HierarchicalInheritance.BankAccountTypes;

public class CheckingAccount extends BankAccount{
    private int withdrawalLimit;

    public CheckingAccount(int accNum, int bankBalance, int withdrawalLimit) {
        super(accNum, bankBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Checking");
    }
}
