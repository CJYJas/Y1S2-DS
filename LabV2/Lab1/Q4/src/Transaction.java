/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Transaction {
    private Date dateTransaction;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.balance = balance;
        this.amount = amount;
        this.description = description;
        Date today = new Date();
        this.dateTransaction = today;
    }
    
    public char getType(){
        return type;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String getDescription(){
        return description;
    }
    
    public Date getTransactionDate(){
        return dateTransaction;
    }
    
    public void setType(char type){
        this.type = type;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setDescritption(String description){
        this.description = description;
    }
}
