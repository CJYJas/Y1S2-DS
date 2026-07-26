/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class PriorityQueue<T extends Comparable<T>>{
    private java.util.LinkedList<T> list = new java.util.LinkedList<>();
    
    public void enqueue(T t){
        if(list.isEmpty()){
            list.addLast(t);
        }
        
        int size = getSize();
        
        for(int i = 0; i < size; i++){
            T packetInList = list.get(i);
            
            if(t.compareTo(packetInList) > 0){
                list.add(i, t);
                return;
            }
        }
        
        list.addLast(t);
    }
    
    public T dequeue(){
        return list.removeFirst();
    }
    
    public int getSize(){
        return list.size();
    }
}
