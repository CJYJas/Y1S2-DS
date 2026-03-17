/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac1;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.*;

public class Prac1 {
    public static void main(String[] args) {
        String readPath = "Prac1.txt";
        String writePath = "Prac1Rec.txt";
        ArrayList<Character> list = new ArrayList<>();
        
        readFile(readPath, list);
        ArrayList<Character> revList = writeFile(writePath, list);
        recurrDisplay(revList, 0);
    }
    
    public static void readFile(String path, ArrayList<Character> list){
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while((line = reader.readLine()) != null){
                for(char c : line.toCharArray()){
                    list.add(c);
                }
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static ArrayList<Character> writeFile(String path, ArrayList<Character> list){
        ArrayList<Character> revList = new ArrayList<>();
        try(FileWriter writer = new FileWriter(path)){
            int size = list.size();
            
            for(int i = size - 1; i >= 0; i--){
                revList.add(list.get(i));
                writer.write(list.get(i));
            }
            writer.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        return revList;
    }
    
    public static void recurrDisplay(ArrayList<Character> list, int currIndex){
        int size = list.size();
        
        if(currIndex == size){
            return;
        }
        
        System.out.print(list.get(currIndex));
        recurrDisplay(list, currIndex + 1);
    }
}

