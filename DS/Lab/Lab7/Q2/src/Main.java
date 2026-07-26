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
public class Main {
    public static void main(String[] args) {
        String fileName = "L7Q2.txt";
        ArrayList<String> list = new ArrayList<>();
        BST<String> tree = new BST<>(list);
        
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                list.add(line);
                tree.insert(line);
            }
            
            reader.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        
        System.out.println("Word Frequency Generator Program");
        tree.inOrder();
    }
}
