/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class Text1 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("text1.txt"))){
            String line;
            int count = 0;
            while((line = reader.readLine()) != null){
                char[] character = line.toCharArray();
                
                for(char c : character){
                    if(Character.isLetter(c)){
                        count ++;
                        System.out.print(c);
                    }
                }
                System.out.println("");
            }
            System.out.println("Number of Character : " + count);
            reader.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }  
}
