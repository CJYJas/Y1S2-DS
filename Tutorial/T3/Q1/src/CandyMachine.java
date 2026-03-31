/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class CandyMachine {
    private Dispenser candyDispenser;
    private Dispenser chipsDispenser;
    private Dispenser gumDispenser;
    private Dispenser cookiesDispenser;
    private CashRegister cashRegister;
    
    public CandyMachine(){
        candyDispenser = new Dispenser("Candy", 50, 10);
        chipsDispenser = new Dispenser("Chips", 75, 10);
        gumDispenser = new Dispenser("Gum", 25, 10);
        cookiesDispenser = new Dispenser("Cookies", 100, 10);

        cashRegister = new CashRegister(1000);
    }
    
    public void showSelection(){
        System.out.println("Welcome to the dispenser");
        System.out.println("1. Candy - $" + (candyDispenser.getProductCost() / 100.0));
        System.out.println("2. Chips - $" + (chipsDispenser.getProductCost() / 100.0));
        System.out.println("3. Gum - $" + (gumDispenser.getProductCost() / 100.0));
        System.out.println("4. Cookies - $" + (cookiesDispenser.getProductCost() / 100.0));
        System.out.println("0. Exit");
    }
    
    public void sellProduct(int choice) {
        Dispenser selectedDispencer = null;
        switch (choice) {
            case 1 -> selectedDispencer = candyDispenser;
            case 2 -> selectedDispencer = chipsDispenser;
            case 3 -> selectedDispencer = gumDispenser;
            case 4 -> selectedDispencer = cookiesDispenser;
            case 0 -> {System.out.println("Thank you for visiting"); return;}
            default -> {
                System.out.println("Invalid selection!"); return;
            }
        }

        if (selectedDispencer.isEmpty()) {
            System.out.println("Sorry, " + selectedDispencer.getProductName() + " is sold out!");
            return;
        }

        System.out.println("Price: $" + (selectedDispencer.getProductCost() / 100.0));
        System.out.print("Insert money (in cents): ");
        Scanner scanner = new Scanner(System.in);
        int amountInserted = scanner.nextInt();

        if (amountInserted < selectedDispencer.getProductCost()) {
            System.out.println("Insufficient money. Returning $" + (amountInserted / 100.0));
            return;
        }

        cashRegister.acceptAmount(selectedDispencer.getProductCost());
        int change = amountInserted - selectedDispencer.getProductCost();
        if (change > 0) {
            System.out.println("Your change: $" + (change / 100.0));
        }

        selectedDispencer.makeSale();
        System.out.println("Enjoy your " + selectedDispencer.getProductName() + "!");
    }
}
