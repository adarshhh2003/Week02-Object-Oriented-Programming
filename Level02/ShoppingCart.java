import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class ShoppingCart {
    private CartItem[] cartItems;
    private int itemCount;

    // Constructor
    public ShoppingCart(int maxItems) {
        cartItems = new CartItem[maxItems];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println("Item added successfully!");
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean itemFound = false;

        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equalsIgnoreCase(itemName)) {
                itemFound = true;
                // Shift remaining items to the left
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null; // Clear last item
                itemCount--;
                System.out.println("Item removed successfully!");
                break;
            }
        }

        if (!itemFound) {
            System.out.println("Item not found in the cart!");
        }
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getPrice() * cartItems[i].getQuantity();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display cart items
    public void displayCartItems() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (int i = 0; i < itemCount; i++) {
                CartItem item = cartItems[i];
                System.out.println(item.getItemName() + " - $" + item.getPrice() + " x " + item.getQuantity());
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart(10); // Create a cart with a maximum of 10 items

        int choice;
        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart Items");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter the name of the item to remove: ");
                    String removeName = scanner.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayCartItems();
                    break;

                case 4:
                    cart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Thank you for using the Shopping Cart System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
