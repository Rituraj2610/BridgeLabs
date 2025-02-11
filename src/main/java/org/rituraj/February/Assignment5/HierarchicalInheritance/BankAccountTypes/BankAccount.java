package org.rituraj.February.Assignment5.HierarchicalInheritance.BankAccountTypes;

public class BankAccount {
    private int accNum;
    private int bankBalance;

    public BankAccount(int accNum, int bankBalance) {
        this.accNum = accNum;
        this.bankBalance = bankBalance;
    }

    void displayDetails(){
        System.out.println("Acc Num: " + accNum);
        System.out.println("Bank Balance: " + bankBalance);
    }
}
