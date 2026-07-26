/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Queue<E>{
    private ArrayList<E> list;
    
    public Queue(){
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public int size(){
        return list.size();
    }
    
    public E peek(){
        return list.getFirst();
    }
    
    public void enqueue(E element){
        list.addLast(element);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
