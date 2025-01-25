package Hierarchical_Inheritance.Bank_Account_Types;

public class CheckingAccount extends BankAccount{
    private double withdrawlLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawlLimit) {
        super(accountNumber, balance);
        this.withdrawlLimit = withdrawlLimit;
    }

    public double getWithdrawlLimit() {
        return withdrawlLimit;
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= withdrawlLimit && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdraw amount exceeds limit  or insufficient balance");
        }
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
