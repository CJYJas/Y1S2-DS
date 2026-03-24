/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class AppendLetter {
    public static void main(String[] args) {
        String[] extraLine = {
            "\n\nI perfomed well in class and I am happy with that.Learning DS teach me to think more structurely.\n",
            "However my aim is still to achive A in this course.\n",
            "I think I have pay my effort on this course but i think i still can done better by being more active in class."
        };
        
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
