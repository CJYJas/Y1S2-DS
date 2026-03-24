/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class Text2 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("text2.txt"))){
            String line;
            int count = 0;
            int lineCount = 0;
            while((line = reader.readLine()) != null){
                char[] character = line.toCharArray();
                lineCount ++;
                for(char c : character){
                    if(Character.isDigit(c)){
                        System.out.print(c);
                    }
                    if(c == ','){
                        count ++;
                    }
                }
                System.out.println("");
            }
            System.out.println("Number of numbers : " + (count + lineCount));
            reader.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }  
}
