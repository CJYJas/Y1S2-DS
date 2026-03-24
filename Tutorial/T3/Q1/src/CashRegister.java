/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CashRegister {
    private double totalPurchase;
    private double cashPaid;
    private double change;
    
    public CashRegister(double totalPurchase, double cashPaid){
        this.totalPurchase = totalPurchase;
        this.cashPaid = cashPaid;
    }
    
    public double CalculateChange(){
        if(cashPaid < totalPurchase){
            System.out.println("Not Enough");
            return 0.0;
        }else{
            change = cashPaid - totalPurchase;
        }
        
        return change;
    }
}
