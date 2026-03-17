
import java.time.Instant;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Account {
    private int id ;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        Date today = new Date();
        this.dateCreated = today;
    }
      
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        Date today = new Date();
        this.dateCreated = today;
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
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = annualInterestRate * 100 / 12;
        return monthlyInterestRate;
    }
    
    public double getMonthlyInterest(){
        double monthlyInterestRate = getMonthlyInterestRate();
        
        return balance * monthlyInterestRate;
    }
    
    public void withdraw(double amount){
        balance -= amount;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
}
