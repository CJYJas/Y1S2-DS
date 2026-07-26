/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Stack<E>{
    ArrayList<E> stack = new ArrayList<>();
    
    public void push(E val){
        stack.add(val);
    }
    
    public E pop(){
        E val = stack.get(stack.size() - 1);
        stack.remove(val);
        return val;
    }
    
    public E peek(){
        E val = stack.get(stack.size() - 1);
        return val;
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
