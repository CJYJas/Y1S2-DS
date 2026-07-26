/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
class ArrayBag<T> implements BagInterface<T>{
    private final T[] bag;
    private int numberOfEntries;
    
    public ArrayBag(){
        T[] tempBag = (T[]) new Object[25];
        this.bag = tempBag;
        numberOfEntries = 0;
    }
    
    @Override
    public void add(T item){
        if(numberOfEntries < bag.length){
            bag[numberOfEntries] = item;
            numberOfEntries ++;
        }
    }
    
    @Override
    public T[] toArray(){
        T[] result = (T[]) new Object[numberOfEntries];
        
        System.arraycopy(bag, 0, result, 0, numberOfEntries);
        
        return result;
    }
    
    @Override
    public boolean contain(T[] bag, T target){
        for(T item : bag){
            if(item.equals(target)){
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public void remove(T anEntry) {
        int index = getIndexOf(anEntry);
        if (index >= 0) {
            bag[index] = bag[numberOfEntries - 1];

            bag[numberOfEntries - 1] = null;
            numberOfEntries--;

        }
    }

    private int getIndexOf(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> otherBag) {
        ArrayBag<T> unionResult = new ArrayBag<>();
        
        for(T item : this.toArray()){
            unionResult.add(item);
        }
        
        T[] contentOfOtherBag = otherBag.toArray();
        for(T item : contentOfOtherBag){
            unionResult.add(item);
        }
        
        return unionResult;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> otherBag) {
        ArrayBag<T> diffResult = new ArrayBag<>();

        // 1. Create a temporary copy of the other bag
        // This is necessary to handle duplicates correctly!
        ArrayBag<T> otherCopy = new ArrayBag<>();
        for (T item : otherBag.toArray()) {
            otherCopy.add(item);
        }

        // 2. Loop through THIS bag's items
        for (T item : this.toArray()) {
            // If other bag contains the item, "remove" it from the copy (match found)
            if (contain(otherCopy.toArray(), item)) {
                otherCopy.remove(item); 
            } else {
                // No match found, so it belongs in the difference
                diffResult.add(item);
            }
        }
        return diffResult;
    }

    @Override
    public BagInterface<T> getSymmetricDifference(BagInterface<T> otherBag) {
        BagInterface<T> diff1 = this.difference(otherBag);
        BagInterface<T> diff2 = otherBag.difference(this);
        
        BagInterface<T> symmetricDiff = diff1.union(diff2);
        return symmetricDiff;
    }    
}
