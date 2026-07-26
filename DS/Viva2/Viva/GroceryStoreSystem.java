/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class GroceryStoreSystem {
    public static void main(String[] args) {
        InventoryManager inventory = new InventoryManager();
        CartList cart = new CartList();
        Scanner sc = new Scanner(System.in);
        String filename = "inventory.txt";
        
        inventory.loadFromFile(filename);
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n--- GROCERY STORE SYSTEM ---");
            System.out.println("1. Display Inventory");
            System.out.println("2. Search Product by Id");
            System.out.println("3. Add Item to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Update Cart Quantity");
            System.out.println("6. Remove Item from Cart");
            System.out.println("7. Undo Last Cart Addition");
            System.out.println("8. Clear Cart");
            System.out.println("9. Checkout (Generate Bill)");
            System.out.println("10. Save and Exit");

            try {
                System.out.print("Enter operation : ");
                int choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice) {
                    case 1 -> 
                        inventory.displayAll();

                    case 2 -> {
                        
                        System.out.print("Enter ID: ");
                        int searchId = Integer.parseInt(sc.nextLine());
                        Product foundId = inventory.searchById(searchId);
                        System.out.println("");
                        if (foundId == null) System.out.println("Product not found.");
                    }

                    case 3 -> {
                        
                        System.out.print("Enter Product ID to buy: ");
                        int buyId = Integer.parseInt(sc.nextLine());
                        Product pToBuy = inventory.getProductById(buyId);
                        if (pToBuy != null) {
                            System.out.print("Enter Quantity: ");
                            int qty = Integer.parseInt(sc.nextLine());
                            cart.addItem(pToBuy, qty);
                        }
                    }

                    case 4 ->
                        cart.displayCart();

                    case 5 -> {
                        System.out.print("Enter Product ID in cart to update: ");
                        int upId = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter NEW total quantity: ");
                        int newQty = Integer.parseInt(sc.nextLine());
                        cart.updateQuantity(upId, newQty);
                    }

                    case 6 -> {
                        System.out.print("Enter Product ID to remove: ");
                        int remId = Integer.parseInt(sc.nextLine());
                        cart.removeItem(remId);
                    }

                    case 7 ->
                        cart.undo();

                    case 8 -> {
                        cart.clear();
                        System.out.println("Cart cleared. Stock restored to inventory.");
                    }

                    case 9 -> {
                        cart.checkout();
                        System.out.print("Checkout complete. Save inventory changes to file? (y/n): ");
                        if (sc.nextLine().equalsIgnoreCase("y")) {
                            inventory.saveToFile(filename);
                            System.out.println("Inventory saved. Goodbye!");
                            running = false;
                            
                        }else {
                            System.out.println("Returning to main menu for next customer...");
                        }
                    }

                    case 10 -> {
                        inventory.saveToFile(filename);
                        System.out.println("Inventory saved. Goodbye!");
                        running = false;
                    }

                    default -> System.out.println("Option not recognized. Please try 1-11.");
                }
                
         
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        sc.close();
    }    
}
