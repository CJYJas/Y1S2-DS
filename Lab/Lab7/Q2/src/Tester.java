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
        System.out.println("Word Frequency Generator Program");
        ArrayList<String> list = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader("L7Q2.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                list.add(line);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        
        BinarySearchTree tree = new BinarySearchTree();
        
        for(String s : list){
            tree.insert(s);
        }
        Node root = tree.root;
        
        tree.inorder();
    }    
}
