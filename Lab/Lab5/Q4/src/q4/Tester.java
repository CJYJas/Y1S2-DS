/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q4;

/**
 *
 * @author User
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a expression : ");
        String line = input.nextLine();
        
        char[] elements = line.toCharArray();
        
        Logic logic = new Logic(elements);
        logic.loadStack();
        
    }    
}
