/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class Text4 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("text4.txt"))){
            String line;
            int digitCount = 0;
            
            while((line = reader.readLine()) != null){
                char[] character = line.toCharArray();

                for(char c : character){
                    if(Character.isLetter(c)){
                        System.out.print(c);
                    }
                    
                    if(Character.isDigit(c)){
                        digitCount ++;
                    }
                }
                
                int alphabetCount = character.length - digitCount;
                System.out.println("");
                System.out.println("Number of alphabets seperated by numbers : " + alphabetCount);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }  
}