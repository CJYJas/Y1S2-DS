/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
interface Account{
    public int deposit(int amount);
    public boolean withdraw(int amount);
}
public class BankAccount implements Account{
    private int balance;
    
    public BankAccount(int balance){
        this.balance = balance;
    }
    
    @Override
    public int deposit(int amount){
        balance = balance + amount;
        return balance;
    }
    
    @Override
    public boolean withdraw(int amount){
        if(amount > balance){
            return false;
        }
        
        balance = balance - amount;
        return true;
    }
}
