/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class StockLogic {
    private MyQueue<Integer> stock = new MyQueue<>();
    private MyQueue<Double> price = new MyQueue<>();
    private String condition;
    private int stockAmount;
    private double stockPrice;
    private double totalGainLoss = 0;
    
    public void analyzeInput(String sentence){
        String[] words = sentence.split(" ");
        
        condition = words[0];
        stockAmount = Integer.parseInt(words[1]);
        stockPrice = Double.parseDouble(words[4].substring(1));
        
        handleCondition(condition);
    }
    
    public void handleCondition(String condition){
        if(condition.equals("Buy")){
            buyLogic();
        }else{
            sellLogic();
        }
    }
    
    public void buyLogic(){
        System.out.println("Buying now ...");
        stock.enqueue(stockAmount);
        price.enqueue(stockPrice);
        
        System.out.println("Queue for Share : " + stock.toString());
        System.out.println("Queue for Price : " + price.toString());
    }
    
    public void sellLogic(){
        System.out.println("Selling the shares now ...");
        
        while(stockAmount > 0 && !stock.isEmpty()){
            int currStockAmount = stock.peek();
            double currPrice = price.peek();
            
            if(stockAmount >= currStockAmount){
                totalGainLoss += (currStockAmount * currPrice);
                stockAmount -= currStockAmount;
                stock.dequeue();
                price.dequeue();
            }else{
                totalGainLoss += (stockAmount * currPrice);
                stock.setElement(0, currStockAmount - stockAmount);

                stockAmount = 0; 
            }
        }
        
        System.out.println("Totak Caoitak Gain / Loss : " + totalGainLoss);
        
        if (stock.isEmpty() && stockAmount > 0) {
            System.out.println("Warning: Ran out of shares! Unsold amount: " + stockAmount);
        }
        
        System.out.println("Queue for Share : " + stock.toString());
        System.out.println("Queue for Price : " + price.toString());
    }
    
    public double getTotalGainLoss(){
        return totalGainLoss;
    }
}
