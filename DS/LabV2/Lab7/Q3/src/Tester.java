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
        Scanner input = new Scanner(System.in);
        String query;
        StockLogic logic = new StockLogic();
        
        while (true) {
            System.out.print("Enter your query (In format 'But / Sell x shares at $y each or -1 to quit): ");
            query = input.nextLine();

            if (query.equals("-1")) {
                break; 
            }

            logic.analyzeInput(query);
        }
        
        System.out.println("Final Capital Gain / Loss : " + logic.getTotalGainLoss());
    }
}
