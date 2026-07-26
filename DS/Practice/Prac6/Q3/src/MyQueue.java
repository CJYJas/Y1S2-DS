/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
import java.util.*;
public class MyQueue<T>{
    private final LinkedList<T> queue;
    
    public MyQueue(){
        this.queue = new LinkedList<>();
    }
    
    public void enqueue(T element){
        queue.addLast(element);
    }
    
    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("The queue is empty");
        }
        
        T popElement = queue.getFirst();
        queue.removeFirst();
        return popElement;
    }
    
    public T peek(){
        return queue.peek();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public int getSize(){
        return queue.size();
    }
}
