/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
class MyStack<E>{
    private final ArrayList<E> list;
    
    public MyStack(){
        this.list = new ArrayList<>();
    }
    
    public void push(E o){
        list.addFirst(o);
    }
    
    public E pop(){
        return list.removeFirst();
    }
    
    public E peek(){
        return list.getFirst();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public boolean search(E o){
        for(E e : list){
            if(e.equals(o)){
                return true;
            }
        }
        
        return false;
    }
    
    public ArrayList<E> getList(){
        return this.list;
    }
}
