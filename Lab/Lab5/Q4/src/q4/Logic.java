/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;
/**
 *
 * @author User
 */
import java.util.*;
public class Logic {
    char[] elements;
    GenericStack<Character> stack = new GenericStack<>();
    
    public Logic(char[] elements){
        this.elements = elements;
    }
    
    Map<Character, Character> map = new HashMap<>();
    public void setPairs(){
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
    }
    
    Map<Character, Character> checkMissingMap = new HashMap<>();
    public void setMissingPairs(){
        checkMissingMap.put('{', '}');
        checkMissingMap.put('(', ')');
        checkMissingMap.put('[', ']');
    }
    
    boolean valid = true;
    
    //load parantheses into stack
    public void loadStack(){
        setPairs();
        setMissingPairs();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < elements.length; i++){
            if(elements[i] == '\\'){
                i ++;
                continue;
            }
            
            if(Character.isLetterOrDigit(elements[i])){continue;}
            
            if(elements[i] == '(' || elements[i] == '[' || elements[i] == '{'){
                stack.push(elements[i]);
            }else{
                if(!stack.isEmpty()){
                    if(!Objects.equals(stack.peek(), map.get(elements[i]))){
                        valid = false;
                        set.add(checkMissingMap.get(stack.pop()));
                        stack.pop();
                    }else{
                        stack.pop();
                    }
                }else{
                    valid = false;
                    System.out.println("Extra " + elements[i]);
                }
            }
        }
        
        if(!stack.isEmpty()){valid = false;}
        while(!stack.isEmpty()){
            set.add(checkMissingMap.get(stack.pop()));
        }
        for(char m : set){
            System.out.println("Missing " + m);
        }
        
        if(valid){System.out.println("The expression is balance");}
    }
}
