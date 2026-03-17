/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Account1 {
    private int id ;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transaction = new ArrayList<>();
    
    
    public Account1(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        Date today = new Date();
        this.dateCreated = today;
    }
      
    public Account1(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        Date today = new Date();
        this.dateCreated = today;
    }
    
    public Account1(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Transaction> getTransaction(){
        return transaction;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = annualInterestRate * 100 / 12;
        return monthlyInterestRate;
    }
    
    public double getMonthlyInterest(){
        double monthlyInterestRate = getMonthlyInterestRate();
        
        return balance * monthlyInterestRate;
    }
    
    public void withdraw(double amount, String description){
        balance -= amount;
        Transaction transac = new Transaction('W', amount, balance, description);
        transaction.add(transac);
    }
    
    public void deposit(double amount, String description){
        balance += amount;
        Transaction transac = new Transaction('D', amount, balance, description);
        transaction.add(transac);
    }
}

