package org.rituraj.February.Assignment6.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        BankAccount savingsAccount = new SavingsAccount("SAV123", "A", 1500.0);
        BankAccount currentAccount = new CurrentAccount("CUR456", "B", 3000.0);

        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            System.out.println("Interest Earned: $" + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000.0);
                if (loanable.calculateLoanEligibility()) {
                    System.out.println("Loan Approved for " + account.getHolderName());
                } else {
                    System.out.println("Loan Denied for " + account.getHolderName());
                }
            }

        }
    }
}
