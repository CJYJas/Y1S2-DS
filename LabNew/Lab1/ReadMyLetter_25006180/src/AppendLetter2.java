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

public class AppendLetter2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> extraLine = new ArrayList<>();
        
        System.out.print("Today day and date (day, dd mm yyyy): ");
        extraLine.add(input.nextLine() + "\n\n");
        
        System.out.print("How you have performed in the class?: ");
        extraLine.add(input.nextLine());
        
        System.out.print("Are you happy with your performance? : ");
        extraLine.add(input.nextLine() + "\n");
        
        System.out.print("What has learning DS taught you / what did you learn from DS? : ");
        extraLine.add(input.nextLine());
        
        System.out.print("Is there any change to your target grade? : ");
        extraLine.add(input.nextLine() + "\n");
        
        System.out.print("What you did well during the course?: ");
        extraLine.add(input.nextLine());
        
         System.out.print("What could have been done better during the course?: ");
        extraLine.add(input.nextLine() + "\n");
        
        try(FileWriter writer = new FileWriter("Jasmine_25006180.txt", true)){
            for(String s : extraLine){
                writer.write(s);
            }
            writer.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }   
}