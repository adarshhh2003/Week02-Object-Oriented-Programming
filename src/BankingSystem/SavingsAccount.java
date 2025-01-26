package BankingSystem;
// Class savingsaccount extends bankaccount and implements loanable
public class SavingsAccount extends BankAccount implements Loanable{
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    public void applyLoan() {
        System.out.println("Loan application submitted for savings account.");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 2; // Loan eligibility is twice the account balance
    }
}
