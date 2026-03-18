/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Map<String, QueueList<String>> categoryMap = new LinkedHashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("L6Q2.txt"))){
            String line;
            
            while((line= reader.readLine()) != null){
                String[] parts = line.split("\\s+");
                
                for(int i = 0; i < parts.length - 1; i+= 2){
                    String code = parts[i];
                    String product = parts[i + 1];
                    
                    QueueList<String> queueList = new QueueList<>();
                    categoryMap.putIfAbsent(code, queueList);
                    categoryMap.get(code).enqueue(product);
                }
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        
        System.out.print("Product Code in Queue : ");
        System.out.println(String.join(" --> ", categoryMap.keySet()) + " -->");
        System.out.println("List of product by categories");
        
        for(Map.Entry<String, QueueList<String>> entry : categoryMap.entrySet()){
            String code = entry.getKey();
            QueueList<String> product = entry.getValue();
            
            System.out.println("Product : " + code);
            
            product.showList();
        }
    }   
}
