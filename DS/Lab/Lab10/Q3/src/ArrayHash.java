/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class ArrayHash<T, E>{
    private HashMap<T, E> hashTable;
    private final int MAXIMUM_SIZE = 20;
    
    public ArrayHash(){
        this.hashTable = new HashMap<>();
    }
    
    public boolean isEmpty(){
        return hashTable.isEmpty();
    }
    
    public boolean isFull(){
        return hashTable.size() > this.MAXIMUM_SIZE;
    }
    
    public int getSize(){
        return hashTable.size();
    }
    
    public void clear(){
        this.hashTable = new HashMap<>();
    }
    
    public void showHashTable(){
        for(T c : hashTable.keySet()){
            System.out.print(c + " : " + hashTable.get(c) + " | ");
        }
        System.out.println("");
    }
    
    public boolean containsKey(T key){
        return hashTable.containsKey(key);
    }
    
    public boolean containsValue(E val){
        return hashTable.containsValue(val);
    }
    
    public E getVal(T key){
        if(containsKey(key)){
            return hashTable.get(key);
        }
        
        return null;
    }
    
    public void put(T key, E val){
        if(!isFull()){
            hashTable.put(key, val);
        }
    }
    
    public void remove(T key){
        hashTable.remove(key);
    }
}
