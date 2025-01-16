import java.util.Scanner;
// Class BankAccount
public class BankAccount {
    // Attributes
    String accountHolder;
    String accountNumber;
    double balance;
    // Constructor to get input
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Method to deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid Deposit amount!");
        }
    }
    // Method to withdraw money
    public void withdraw(double amount) {
        if(amount < balance && amount > 0) {
            balance -= amount;
            System.out.println("Withrawn: " + amount);
        } else if(amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

}
// Main class
class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt to get input from the user
        System.out.println("Enter the account holder name: ");
        String accountHolder = input.nextLine();

        System.out.println("Enter the account number: ");
        String accountNumber = input.nextLine();

        System.out.println("Enter the inital balance: ");
        double balance = input.nextDouble();
        // Create object of the class
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        int choice;
        do {
            // Prompt to get the input for operation detail
            System.out.println("---ATM Menu---");
            System.out.println("Press 1 to Display Balance");
            System.out.println("Press 2 to Deposit Money");
            System.out.println("Press 3 to Withdraw Money");
            System.out.println("Press 4 to Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    account.displayBalance();
                    break;
                case 2:
                    System.out.println("Enter Deposit Amount");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter Withdraw Amount");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thankyou for using ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while( choice != 4);
        // Close the scanner object to release resources
        input.close();
    }
}