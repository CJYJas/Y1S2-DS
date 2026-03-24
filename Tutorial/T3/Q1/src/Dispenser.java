/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Dispenser {
    private String type;
    private double price;
    private double totalPurchase;
    private Map<String, Double> priceList = new HashMap<>();
    
    public Dispenser(String type){
        this.type = type;
        priceList.put("Candies", 0.2);
        priceList.put("Chips", 3.5);
        priceList.put("Gum", 1.2);
        priceList.put("Cookies", 2.5);
    }
    
    public double getPrice(){
        price =  priceList.get(type);
        return price;
    }
    
    public double getTotalPurchase(int amount){
        totalPurchase = amount * price;
        return totalPurchase;
    }
    
    public double getChange(double cashPaid){
        CashRegister change = new CashRegister(totalPurchase, cashPaid);
        double changeGiven = change.CalculateChange();
        
        return changeGiven;
    }
}
