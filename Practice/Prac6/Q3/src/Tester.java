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
        StockTransactionEngine stock = new StockTransactionEngine();
        
        stock.buy(100, 10.0);
        stock.buy(50, 20.0);
        double capitalGain = stock.sell(110, 15.0);
        
        System.out.println("Capital Gain or Loss = RM" + capitalGain);
    }   
}
