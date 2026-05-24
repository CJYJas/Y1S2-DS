/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
class UniqueFreqBag<T> implements BagInterface<T>{
    private final int DEFAULT_CAPACITY = 25;
    private ArrayList<T> arrayBag;
    
    public UniqueFreqBag(){
        this.arrayBag = new ArrayList<>();
    }

    @Override
    public boolean add(T newEntry) {
        if(arrayBag.size() > this.DEFAULT_CAPACITY){
            return false;
        }
        
        arrayBag.add(newEntry);
        return true;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int freq = 0;
        
        for(T item : this.arrayBag){
            if(item.equals(anEntry)){
                freq ++;
            }
        }
        
        return freq;
    }
    
    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
        BagInterface<T> intersectionResult = new UniqueFreqBag<>();
        
        
        for(T item : this.arrayBag){
            int thisBagFreq = this.getFrequencyOf(item);
            int anotherBagFreq = anotherBag.getFrequencyOf(item);
            
            int diff = Math.min(thisBagFreq, anotherBagFreq);
            
            for(int i = 0; i < diff; i++){
                intersectionResult.add(item);
            }
            
            this.remove(item, this.arrayBag);
            
        }
        
        return intersectionResult;
    }
    
    @Override
    public void remove(T anEntry, ArrayList<T> bag){
        for(T item : bag){
            if(bag.equals(anEntry)){
                bag.remove(item);
            }
        }
    }
    
}
