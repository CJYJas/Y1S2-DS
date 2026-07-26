/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CashRegister {
    private int cashOnHand;

    public CashRegister(int cashOnHand){
        this.cashOnHand = cashOnHand;
    }

    public int getCashOnHand(){
        return cashOnHand;
    }

    public void acceptAmount(int amount){
        cashOnHand += amount;
    }

    public int returnChange(int amountReceived) {
        if (amountReceived > cashOnHand) {
            int change = amountReceived - cashOnHand;
            cashOnHand = 0;
            return change;
        }
        cashOnHand -= amountReceived;
        return 0;
    }

    public boolean isEmpty(){
        return cashOnHand == 0;
    }
}
