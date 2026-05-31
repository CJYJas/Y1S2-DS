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
        String fileName = "L10Q4.txt";
        ArrayHashTableHashing hashTable = new ArrayHashTableHashing(20);
        
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            
            while((line = reader.readLine()) != null){
                String[] data = line.split(":");
                
                if (data.length >= 2) {
                    hashTable.put(data[0], data[1]);
                } else {
                    System.out.println("Skipping malformed line: " + line);
                }
            }
            
            reader.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        
        hashTable.printTable();
        System.out.println("The Hash Table size is " + hashTable.getSize());
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a PID to search : ");
        String search = input.nextLine();
        
        hashTable.search(search);
    }
}
