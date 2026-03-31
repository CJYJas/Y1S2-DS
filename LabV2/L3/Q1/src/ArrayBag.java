/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class ArrayBag<T> implements BagInterface<T>{
    private ArrayList<T> bag;
    final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;
    
    public ArrayBag(){
        bag = new ArrayList<>();
        numberOfEntries = 0;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries >= DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        bag.add(newEntry);
        numberOfEntries ++;
        return true;
    }

    @Override
    public T remove() {
        if(isEmpty()) return null;
        numberOfEntries --;
        
        return bag.remove(numberOfEntries);
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i = 0; i < bag.size(); i++) {
            if (bag.get(i).equals(anEntry)) {
                bag.remove(anEntry);
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        numberOfEntries = 0;
        bag.clear();
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        
        for(T t : bag){
            if(t.equals(anEntry)){
                count ++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        for(T t : bag){
            if(t.equals(anEntry)){
                return true;
            }
        }
        
        return false;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) bag.toArray(new Object[numberOfEntries]);
        return result;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> bag2) {
        BagInterface<T> unionBag = new ArrayBag<>();
        
        T[] firstBagContents = this.toArray();
        for (T item : firstBagContents) {
            unionBag.add(item);
        }
        
        T[] secondBagContents = bag2.toArray();
        for (T item : secondBagContents) {
            unionBag.add(item);
        }
        
        return unionBag;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> bag2) {
        BagInterface<T> intersectionBag = new ArrayBag<>();
        
        for (T item : bag) {
            if (bag2.contains(item)) {
                intersectionBag.add(item);
                bag2.remove(item);
            }
        }
        
        return intersectionBag;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> bag2) {
        BagInterface<T> differenceBag = new ArrayBag<>();
        for (T item : bag) {
            if (bag2.contains(item)) {
                bag2.remove(item);
            } else {
                differenceBag.add(item);
            }
        }
        
        return differenceBag;
    } 
}

