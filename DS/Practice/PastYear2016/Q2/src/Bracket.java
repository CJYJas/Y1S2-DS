/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Bracket{
    private char[] element;
    
    public void digest(String line){
        element = line.toCharArray();
        checkBalance(element);
    }
    
    private char bracketMap(char c){
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');
        bracketMap.put(')', '(');
        bracketMap.put('>', '<');
        
        return bracketMap.get(c);
    }
    
    private void checkBalance(char[] element){
        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        boolean bracketPresence = false;
        
        for(char c : element){
            if(c == '[' || c == '{' || c == '(' || c == '<'){
                bracketPresence = true;
                stack.push(c);
                continue;
            }
            
            if(c == ']' || c == '}' || c == ')' || c == '>'){
                bracketPresence = true;
                if (stack.isEmpty() || stack.pop() != bracketMap(c)) {
                    valid = false;
                    break;
                }
            }
        }
        
        if(!bracketPresence){
            System.out.println("There is no bracket in the input");
        }else{
            if(!valid){
                System.out.println("Not all brackets are matched");
            }else{
                System.out.println("YES - all matched");
            }
        }
    }
}
