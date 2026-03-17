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
public class ReadLetter{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("Jasmine_25006180.txt"))){
            String line;
            ArrayList<String> content = new ArrayList<>();
            
            while((line = reader.readLine()) != null){
                content.add(line);
            }
            
            reader.close();
            
            for(String s : content){
                System.out.println(s);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }  
}
