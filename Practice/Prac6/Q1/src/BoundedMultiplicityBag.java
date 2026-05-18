/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class BoundedMultiplicityBag<T> implements BagInterface<T>{
    private final T[] bag;
    private int numberOfEntries;
    private final int multiplicityLimit;
    private final int capacity;
    
    public BoundedMultiplicityBag(int capacity, int multiplicityLimit){
        this.numberOfEntries = 0;
        this.capacity = capacity;
        this.multiplicityLimit = multiplicityLimit;
        this.bag = (T[]) new Object[capacity];
    }
    
    @Override
    public int getCurrentSize() {
        return bag.length;
    }

    @Override
    public boolean isEmpty() {
        return bag.length == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if(numberOfEntries == this.capacity){
            return false;
        }
        
        if(getFrequencyOf(newEntry) > this.multiplicityLimit){
            return false;
        }
        
        bag[this.numberOfEntries] = newEntry;
        numberOfEntries ++;
        
        return true;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for(T item : bag){
            if(item != null && item.equals(anEntry)){
                count ++;
            }
        }    
        return count;
    }

    @Override
    public T[] toArray() {
        return bag;
    }
    
    public BoundedMultiplicityBag<T> difference(BoundedMultiplicityBag<T> anotherBag){
        BoundedMultiplicityBag<T> differenceBag = new BoundedMultiplicityBag<>(this.capacity, this.multiplicityLimit);
        
        for(T item : this.bag){
            if(item == null){
                continue;
            }
            
            if (differenceBag.getFrequencyOf(item) > 0) {
                continue; 
            }
            
            int thisFreq = this.getFrequencyOf(item);
            int otherFreq = anotherBag.getFrequencyOf(item);
            int diff = thisFreq - otherFreq;
            
            if(diff <= 0){
                continue;
            }
            
            for(int i = 0; i < diff; i++){
                if(!differenceBag.add(item)){
                    break;
                }
            }
        }
        return differenceBag;
    }
    
    public void printElement(){
        System.out.print("Element inside this bag : ");
        for(T item : this.bag){
            System.out.print(item + " ");
        }
        System.out.println("");
    }
    
}
