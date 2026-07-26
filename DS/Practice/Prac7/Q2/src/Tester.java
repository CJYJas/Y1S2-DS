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
        String readFileName = "Q2.txt";
        String writeFileName = "Q2_reversed.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(readFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(writeFileName))) {
            
            reverseFileRecursive(reader, writer);   
        } catch (IOException e) {
            System.err.println("An error occurred while processing files: " + e.getMessage());
        }
    }
    
    private static void reverseFileRecursive(BufferedReader reader, BufferedWriter writer) throws IOException {
        String line = reader.readLine();

        if (line == null) {
            return;
        }

        reverseFileRecursive(reader, writer);
        
        writer.write(line);
        writer.newLine(); 
    }
}
