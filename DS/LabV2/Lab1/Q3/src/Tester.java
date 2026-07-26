/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tester {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000, 4.5);
        
        account1.withdraw(2500);
        account1.deposit(3000);
        
        System.out.println("Account Balance : $" + account1.getBalance());
        System.out.println("Monthly Interest : $" + account1.getMonthlyInterest());
        System.out.println("Account created at : " + account1.getDateCreated());
    }    
}
