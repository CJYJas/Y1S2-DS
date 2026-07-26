/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */

public class ArrayBag<T> implements BagInterface<T>{
    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    
    public ArrayBag(){
        T[] tempBag = (T[]) new Object[DEFAULT_CAPACITY];
        this.bag = tempBag;
        this.numberOfEntries = 0;
    }
    
    @Override
    public int getCurrentSize() {
        return bag.length;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries >= bag.length;
    }

    @Override
    public boolean isEmpty() {
        return getCurrentSize() == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if(isFull()){
            return false;
        }
        
        bag[numberOfEntries] = newEntry;
        numberOfEntries ++;
        return true;
    }

    @Override
    public T remove() {
        if(isEmpty()){
            return null;
        }
        
        T removedElement =  bag[getCurrentSize() - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries --;
        
        return removedElement;
    }

    @Override
    public boolean remove(T anEntry) {
        if(isEmpty()){
            return false;
        }
        
        int index = getIndexOf(anEntry);
            
        if(index >= 0){
            bag[index] = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries --;
            return true;
        }
        
        return false;
    }
    
    private int getIndexOf(T anEntry){
        for(int i = 0; i < bag.length; i++){
            if(bag[i].equals(anEntry)){
                return i;
            }
        }
        
        return -1;
    }

    @Override
    public void clear() {
        for(int i = 0; i < numberOfEntries; i ++){
            bag[i] = null;
        }
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        if(isEmpty()){
            return -1;
        }
        
        int frequency = 0;
        
        T[] myItem = this.toArray();
        for(T t : myItem){
            if(t.equals(anEntry)){
                frequency ++;
            }
        }
        
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        if(isEmpty()){
            return false;
        }
        
        T[] myItems = this.toArray();
        for(T t : myItems){
            if(t.equals(anEntry)){
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public T[] toArray(){
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries]; 

        // 2. Copy only the occupied slots from the internal bag to the result array
        System.arraycopy(bag, 0, result, 0, numberOfEntries);

        // 3. Return the clean, full array
        return result;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> otherBag) {
        BagInterface<T> unionBag = new ArrayBag<>();
        
        T[] thisItems = this.toArray();
        for (T item : thisItems) {
            unionBag.add(item);
        }

        T[] otherItems = otherBag.toArray();
        for (T item : otherItems) {
            if(!unionBag.contains(item)){
                unionBag.add(item);
            }
        }
        
        return unionBag;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> otherBag) {
        BagInterface<T> intersectionBag = new ArrayBag<>();
        
        T[] myItems = this.toArray();
        for(T item : myItems){
            if(otherBag.contains(item)){
                intersectionBag.add(item);
            }
        }
        
        return intersectionBag;    
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> otherBag) {
        BagInterface<T> differenceBag = new ArrayBag<>();
        
        T[] myItems = this.toArray();
        for (T item : myItems) {
            differenceBag.add(item);
        }

        T[] otherItems = otherBag.toArray();
        for (T item : otherItems) {
            if (differenceBag.contains(item)) {
                differenceBag.remove(item);
            }
        }
        
        return differenceBag; 
    }

    @Override
    public boolean isSubsetOf(BagInterface<T> otherBag) {
        if(getCurrentSize() > otherBag.getCurrentSize()){
            return false;
        }
        
        T[] myItems = this.toArray();

        // 3. Frequency check
        for (T item : myItems) {
            // Compare the counts, not just existence
            if (this.getFrequencyOf(item) > otherBag.getFrequencyOf(item)) {
                return false;
            }
        }
        return true;
    }
}
