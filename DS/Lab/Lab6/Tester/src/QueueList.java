/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class QueueList<T>{
    private java.util.LinkedList<T> list = new java.util.LinkedList<>();
    
    public void enqueue(T t){
        list.addLast(t);
    }
    
    public T dequeue(){
        return list.removeFirst();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public void showList(){
        int listSize = getSize();
        
        for(int i = 0; i < listSize; i++){
            System.out.print(list.get(i) + " --> ");
        }
        
        System.out.println("");
    }
}
