/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Account1 account = new Account1(1122, 1000, 1.5);
        account.setName("George");
        
        account.deposit(30, "Deposit 30$");
        account.deposit(40, "Deposit 40$");
        account.deposit(50, "Deposit 50$");
        
        account.withdraw(5,"Withdraw $5");
        account.withdraw(4,"Withdraw $4");
        account.withdraw(2,"Withdraw $2");
        
        System.out.println("Account Holder name : " + account.getName());
        System.out.println("Interest rate : " + account.getMonthlyInterestRate() + " %");
        System.out.println("Account Balance : " + account.getBalance());
        
        ArrayList<Transaction> transaction = account.getTransaction();
        for(Transaction t : transaction){
            System.out.println("Transaction Type: " + t.getType());
            System.out.println("Transaction date : " + t.getTransactionDate());
            System.out.println("Transaction amount : " + t.getAmount());
            System.out.println("Transaction balance : " + t.getBalance());
            System.out.println("Transaction description : " + t.getDescription());
        }
    }   
}
