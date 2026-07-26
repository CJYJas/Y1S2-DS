/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class StockTransactionEngine{
    private final MyQueue<Integer> shareQueue;
    private final MyQueue<Double> priceQueue;
    
    public StockTransactionEngine(){
        this.shareQueue = new MyQueue<>();
        this.priceQueue = new MyQueue<>();
    }
    
    public void buy(int shares, double price){
        shareQueue.enqueue(shares);
        priceQueue.enqueue(price);
    }
    
    public double sell(int shares, double price){
        double capitalGain = 0.0;
        int currNeedSell = shares;
        
        while(currNeedSell > 0 && !shareQueue.isEmpty()){
            int latestSharesAmount = shareQueue.dequeue();

            if(currNeedSell < latestSharesAmount){
                int diff = latestSharesAmount - currNeedSell;
                shareQueue.enqueue(diff);
                capitalGain += currNeedSell * (price - priceQueue.peek());
                currNeedSell = 0;
                
                continue;
            }
            
            capitalGain += latestSharesAmount * (price - priceQueue.dequeue());
            currNeedSell -= latestSharesAmount;
        }
        
        if(currNeedSell > 0){
            throw new IllegalStateException("Number of shares requested to be sold exceeds the current shares available in the portfolio");
        }
        
        return capitalGain;
    }
}
