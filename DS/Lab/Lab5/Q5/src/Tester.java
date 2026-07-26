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
public class Tester {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Documents\\Jasmine\\Y1S2\\DS\\Lab\\Lab5\\Q5\\test.xml"))){
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }  
        
        Logic logic = new Logic(lines);
        logic.findTag();
    }    
}
