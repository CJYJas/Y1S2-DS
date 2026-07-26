/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
class MyQueue<E>{
    private LinkedList<E> queue;
    
    public MyQueue(E[] e){
        this.queue = new LinkedList<>();
        queue.addAll(Arrays.asList(e));
    }
    
    public MyQueue(){
        this.queue = new LinkedList<>();
    }
    
    public void enqueue(E e){
        queue.addLast(e);
    }
    
    public E dequeue(){
        return queue.removeFirst();
    }
    
     public E getElement(int i){
        return queue.get(i);
    }
    
    public E peek(){
        return queue.peek();
    }
    
    public int getSize(){
        return queue.size();
    }
    
    public boolean contains(E e){
        return queue.contains(e);
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public void cancelOrder(E target){
        MyStack<E> stack = new MyStack<>();
        
        while(!this.isEmpty()){
            stack.push(this.dequeue());
        }
        
        while (!stack.isEmpty()) {
            this.enqueue(stack.pop());
        }
        
        while (!this.isEmpty()) {
            stack.push(this.dequeue());
        }
        
        while (!stack.isEmpty()) {
            E current = stack.pop();
            if (!current.equals(target)) {
                this.enqueue(current);
            }
        }
    }
    
    @Override
    public String toString(){
        return "Queue : " + queue.toString();
    }
}


