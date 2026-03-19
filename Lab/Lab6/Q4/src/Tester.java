/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
import java.io.*;
public class Tester {
    public static void main(String[] args) {
        Queue<StockBatch> queue = new LinkedList<>();
        double totalGain = 0;
        
        System.out.println("List of Transactions");
        try(BufferedReader reader = new BufferedReader(new FileReader("L6Q4.txt"))){
            String line;
            
            while((line = reader.readLine()) != null){
                System.out.println(line + " -->");
                String[] info = line.split("\\s+");
                
                String type = info[3];
                int quantity = Integer.parseInt(info[4]);
                double price = Double.parseDouble(info[8]);
                
                if(type.equals("Buy")){                    
                    queue.add(new StockBatch(quantity, price));
                }else{
                    totalGain =caclculateGainOrLoss(queue, quantity, price);
                }
            }
            System.out.println("Total Gain " + totalGain);
            reader.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public static double caclculateGainOrLoss(Queue<StockBatch> queue, int quantity, double price){
        double totalGain = 0;
        
        while(quantity > 0){
            int batchQuantity = queue.peek().quantity;
            double batchPrice = queue.peek().price;
            
            if(batchQuantity <= quantity){
                totalGain += batchQuantity * (price - batchPrice);
            }else{
                totalGain += quantity * (price - batchPrice);    
            }
            
            quantity -= batchQuantity;
            queue.poll();
        }
        
        return totalGain;
    }
}
