package org.rituraj.February.Assignment6.BankingSystem;

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " submitted for Current Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 2000;
    }
}
