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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("We are selling candies, chips, gum and cookies");
        System.out.print("Please make your selection : (1)candies (2)chips (3)gum (4)cookies");
        int choice = input.nextInt();
        
        String type = "";
        
        switch(choice){
            case 1 -> type = "Candies";
            case 2 -> type = "Chips";
            case 3 -> type = "Gum";
            case 4 -> type = "Cookies";
        }
        
        Dispenser dispenser = new Dispenser(type);
        
        System.out.println("The price for a single item is RM" + dispenser.getPrice());
        System.out.print("Enter amount to buy : ");
        int amount = input.nextInt();
        
        double totalPurchase = dispenser.getTotalPurchase(amount);
        System.out.println("Total Amount to Pay : RM" + totalPurchase);
        System.out.print("Cash Given : ");
        double cashPaid = input.nextDouble();
        
        System.out.println("Change Given : RM" + dispenser.getChange(cashPaid));
        System.out.println(type + " released");
    }    
}
