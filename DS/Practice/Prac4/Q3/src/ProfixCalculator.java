/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class ProfixCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter infix expression : ");
        String infix = input.nextLine();
        String[] element = infix.split(" ");
        CalLogic logic = new CalLogic(element);
        
        //turn into infix expression
        System.out.print("The infix expression is : ");
        logic.changeIntoInfix();
        System.out.println("");
        
        //turn into postfix
        System.out.print("The postfix expression is : ");
        logic.changeIntoPostfix();
        System.out.println("");
        
        //cal
        System.out.println("The result is : " + logic.calculateLogic());
    }    
}
