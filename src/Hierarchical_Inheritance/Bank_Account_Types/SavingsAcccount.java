package Hierarchical_Inheritance.Bank_Account_Types;

public class SavingsAcccount extends BankAccount{
    private double interestRate;

    public SavingsAcccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
