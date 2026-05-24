/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class MyQueue<E>{
    private LinkedList<E> list;
    
    public MyQueue(){
        this.list = null;
    }
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        return list.removeLast();
    }
    
    public E getElement(int i){
        return list.get(i);
    }
    
    public int getSize(){
        return list.size();
    }
}
