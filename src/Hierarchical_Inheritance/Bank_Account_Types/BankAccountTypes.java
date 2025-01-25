package Hierarchical_Inheritance.Bank_Account_Types;

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAcccount savings = new SavingsAcccount("SA123", 2000.0, 0.05);
        CheckingAccount checking = new CheckingAccount("CA123", 3000.0, 500.0);
        FixedDepositAccount fixed = new FixedDepositAccount("FA123", 4000.0, 12);

        savings.displayAccountType();
        savings.displayAccountInfo();
        System.out.println("Interest Rate: " + savings.getInterestRate() + "\n");

        checking.displayAccountType();
        checking.displayAccountInfo();
        System.out.println("Withdrawl Limit: " + checking.getWithdrawlLimit() + "\n");

        fixed.displayAccountType();
        fixed.displayAccountInfo();
        System.out.println("Deposit Term: " + fixed.getDepositTerm() + "\n");

        savings.deposit(500.0);
        checking.withdraw(500.0);
        fixed.withdraw(100.0);
    }
}
