package org.rituraj.February.Assignment5.HierarchicalInheritance.BankAccountTypes;

public class SavingsAccount extends BankAccount{
    private int interesetRate;

    public SavingsAccount(int accNum, int bankBalance, int interesetRate) {
        super(accNum, bankBalance);
        this.interesetRate = interesetRate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Savings");
    }
}
