/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
class PriorityQueueLogic<T>{
    private final PriorityQueue<T> list;
    
    public PriorityQueueLogic(){
        this.list = new PriorityQueue<>();
    }
    
    public PriorityQueueLogic(boolean b){
        this.list = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void add(T element){
        list.add(element);
    }
    
    public T poll(){
        return list.poll();
    }
    
    public T peek(){
        return list.peek();
    }
    
    public boolean contains(T element){
        return list.contains(element);
    }
    
    public int size(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        // This delegates the logic to the internal PriorityQueue 'list'
        return list.toArray(a);
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
