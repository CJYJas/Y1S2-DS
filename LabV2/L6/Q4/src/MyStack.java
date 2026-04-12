/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class MyStack<E>{
    ArrayList<E> list = new ArrayList<>();
    
    public void push(E element){
        list.add(element);
    }
    
    public E pop(){
        E value = list.remove(list.size() - 1);
        return value;
    }
    
    public E peek(){
        E value = list.get(list.size() - 1);
        return value;
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
