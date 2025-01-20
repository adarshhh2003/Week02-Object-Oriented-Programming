class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        if(balance < 0) {
            System.out.println("Balance should not be negative. Please try again.");
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayResults() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(6411319, "Vijay Kumar", 5088.72);
        account.displayResults();
        System.out.println();
        account.displayDetails();
        System.out.println();
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Holder: " + account.accountHolder);
        account.setBalance(88098.36);
        System.out.println("Balance: " + account.getBalance());
    }
}
