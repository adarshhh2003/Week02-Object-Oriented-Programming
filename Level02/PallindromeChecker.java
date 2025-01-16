import java.util.Scanner;
// Class PallindromeChecker
public class PallindromeChecker {
    // Attributes
    String text;
    boolean result;
    // Constructor to get the input
    PallindromeChecker(String text) {
        this.text = text;
    }
    // Method to check the string is pallindrome or not
    public boolean isPallindrome() {
        int left = 0;
        int right = text.length() - 1;

        while(left <= right) {
            if(text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    // Method to display the result
    public void displayResult() {
        if(isPallindrome()) {
            System.out.println("The given string: " + text + " is Pallindrome");
        } else {
            System.out.println("The given string: " + text + " is not Pallindrome");
        }
    }

}
// Main class
class CheckPallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt to get the input
        System.out.println("Enter the text");
        String text = input.nextLine();
        // Create class object
        PallindromeChecker obj = new PallindromeChecker(text);
        obj.displayResult();
        // Close the scanner object to release resources
        input.close();
    }
}
