package Hierarchical_Inheritance.Bank_Account_Types;

public class FixedDepositAccount extends BankAccount{
    private int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public int getDepositTerm() {
        return depositTerm;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account.");
    }
}
