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
        String readpath = "Q2txtfile.txt";
        String writePath = "Q2reversetxt.txt";
        
        ArrayList<String> oriList = readFile(readpath);
        ArrayList<String> revList = writeFile(writePath, oriList);
        
        System.out.println("Original List");
        printList(oriList, 0);
        System.out.println("Reversed List");
        printList(revList, 0);
    }
    
    public static ArrayList<String> readFile(String path){
        String line;
        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            while((line = reader.readLine()) != null){
                list.add(line);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        
        return list;
    }
    
    public static ArrayList<String> writeFile(String writePath, ArrayList<String> oriList){
        ArrayList<String> list = new ArrayList<>();
        
        try(FileWriter writer = new FileWriter(writePath)){
            int size = oriList.size();
            for(int i = size - 1; i >= 0; i--){
                writer.write(oriList.get(i) + "\n");
                list.add(oriList.get(i));
            }
            writer.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        
        return list;
    }
    
    public static void printList(ArrayList<String> list, int index){
        if(index == list.size()){
            return;
        }
        
        System.out.println(list.get(index));
        
        printList(list, index + 1);
    }
}
