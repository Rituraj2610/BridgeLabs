package org.rituraj.February.Assignment6.BankingSystem;

class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " submitted for Savings Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 1000;
    }
}
