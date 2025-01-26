package BankingSystem;

import java.util.ArrayList;
import java.util.List;
// Main class
public class BankingSystem {
    // Main method
    public static void main(String[] args) {
        // Create arraylist
        List<BankAccount> accounts = new ArrayList<>();
        // Create objects of the classes
        SavingsAccount savings = new SavingsAccount("SA123", "Adarsh Patel", 9800000.0);
        CurrentAccount current = new CurrentAccount("CA123", "Mohit Raj", 6500.0);
        // Add objects to the list
        accounts.add(savings);
        accounts.add(current);
        // Display account details and calculate interest
        for(BankAccount account: accounts) {
            account.displayDetails();
            System.out.println("Interest: " + account.calculateInterest());

            if(account instanceof Loanable) {
                ((Loanable)account).applyLoan();
                System.out.println("Loan Eligibility: " + ((Loanable)account).calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
