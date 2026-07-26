/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logic l = new logic();
        
        System.out.print("Enter infix expression : ");
        String infix = input.nextLine();
        
        String[] elements = infix.split(" ");
        ArrayList<String> infixElements = new ArrayList<>();
        System.out.print("The infix expression is ");
        for(String s : elements){
            String curr = l.infixExpression(s);
            infixElements.add(curr);
            System.out.print(curr + " ");
        }
        System.out.println("");
        
        System.out.print("The postfix expression is : ");
        ArrayList<String> prefixElements = l.postfixExpression(infixElements);
        for(String s : prefixElements){
            System.out.print(s + " ");
        }
        System.out.println("");
        
        System.out.println("The result is : " + l.postFixEvaluation(prefixElements));
    }
    
}
