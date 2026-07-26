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
    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public static void main(String[] args) {
        InventoryManager inventory = new InventoryManager();
        CartList cart = new CartList();
        Scanner sc = new Scanner(System.in);
        String filename = "inventory.txt";
        
        inventory.loadFromFile(filename);
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n--- GROCERY STORE SYSTEM ---");
            System.out.println("1. Inventory Management");
            System.out.println("2. Shopping Cart");
            System.out.println("3. Checkout (Generate Bill)");
            System.out.println("4. Save and Exit");

            int choice = readInt(sc, "Enter operation: ");

            switch (choice) {
                case 1 -> {
                    boolean invMenu = true;
                    while (invMenu) {
                        System.out.println("\n--- INVENTORY MANAGEMENT ---");
                        System.out.println("1. Display all products");
                        System.out.println("2. Search product by ID");
                        System.out.println("3. Search product by name");
                        System.out.println("4. Add new product");
                        System.out.println("5. Remove product");
                        System.out.println("6. Update stock");
                        System.out.println("7. Save inventory to file");
                        System.out.println("8. Back to main menu");

                        int invChoice = readInt(sc, "Select: ");
                        switch (invChoice) {
                            case 1 -> inventory.displayAll();
                            case 2 -> {
                                int id = readInt(sc, "Enter ID: ");
                                Product p = inventory.searchById(id);
                                if (p == null) System.out.println("Product not found.");
                                else System.out.println(p);
                            }
                            case 3 -> {
                                System.out.print("Enter name (partial, case-insensitive): ");
                                String name = sc.nextLine().trim();
                                ArrayList<Product> results = inventory.searchByName(name);
                                if (results.isEmpty()) {
                                    System.out.println("No matching products found.");
                                } else {
                                    System.out.printf("%-10s %-20s %-10s %-10s%n", "ID", "Name", "Price", "Stock");
                                    System.out.println("------------------------------------------------------------");
                                    for (Product p : results) {
                                        System.out.printf("%-10d %-20s RM%-8.2f %-10d%n",
                                                p.getId(), p.getName(), p.getPrice(), p.getStock());
                                    }
                                }
                            }
                            case 4 -> {
                                int id = readInt(sc, "Enter new product ID: ");
                                System.out.print("Enter name (no spaces recommended): ");
                                String name = sc.nextLine().trim();
                                double price = readDouble(sc, "Enter price: ");
                                int stock = readInt(sc, "Enter stock: ");
                                inventory.addProduct(new Product(id, name, price, stock));
                                System.out.println("Add product attempted (check message above if duplicate).");
                            }
                            case 5 -> {
                                int id = readInt(sc, "Enter product ID to remove: ");
                                inventory.removeProduct(id);
                            }
                            case 6 -> {
                                int id = readInt(sc, "Enter product ID to update: ");
                                int newStock = readInt(sc, "Enter new stock quantity: ");
                                inventory.updateStock(id, newStock);
                                System.out.println("Stock update attempted.");
                            }
                            case 7 -> {
                                inventory.saveToFile(filename);
                                System.out.println("Inventory saved.");
                            }
                            case 8 -> invMenu = false;
                            default -> System.out.println("Option not recognized. Please try 1-8.");
                        }
                    }
                }
                case 2 -> {
                    boolean cartMenu = true;
                    while (cartMenu) {
                        System.out.println("\n--- SHOPPING CART ---");
                        System.out.println("1. Add item to cart");
                        System.out.println("2. View cart");
                        System.out.println("3. Update item quantity in cart");
                        System.out.println("4. Remove item from cart");
                        System.out.println("5. Undo last cart addition");
                        System.out.println("6. Clear cart");
                        System.out.println("7. Back to main menu");

                        int cartChoice = readInt(sc, "Select: ");
                        switch (cartChoice) {
                            case 1 -> {
                                int id = readInt(sc, "Enter Product ID to add: ");
                                Product p = inventory.getProductById(id);
                                if (p == null) {
                                    System.out.println("Product not found.");
                                    break;
                                }
                                int qty = readInt(sc, "Enter quantity: ");
                                cart.addItem(p, qty);
                            }
                            case 2 -> cart.displayCart();
                            case 3 -> {
                                int id = readInt(sc, "Enter Product ID in cart to update: ");
                                int newQty = readInt(sc, "Enter NEW total quantity: ");
                                cart.updateQuantity(id, newQty);
                            }
                            case 4 -> {
                                int id = readInt(sc, "Enter Product ID to remove: ");
                                cart.removeItem(id);
                            }
                            case 5 -> cart.undo();
                            case 6 -> {
                                cart.clear();
                                System.out.println("Cart cleared. Stock restored to inventory.");
                            }
                            case 7 -> cartMenu = false;
                            default -> System.out.println("Option not recognized. Please try 1-7.");
                        }
                    }
                }
                case 3 -> {
                    cart.checkout();
                    System.out.print("Checkout complete. Save inventory changes to file now? (y/n): ");
                    if (sc.nextLine().trim().equalsIgnoreCase("y")) {
                        inventory.saveToFile(filename);
                        System.out.println("Inventory saved.");
                    }
                }
                case 4 -> {
                    inventory.saveToFile(filename);
                    System.out.println("Inventory saved. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Option not recognized. Please try 1-4.");
            }
        }
        sc.close();
    }    
}
