/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class Tester {
    public static void main(String[] args) {
        String fileName = "BracMatch.txt";
        Bracket bracket = new Bracket();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            
            while((line = reader.readLine()) != null){
                System.out.println(line);
                bracket.digest(line);
            }
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
