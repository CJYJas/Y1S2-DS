/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public interface BagInterface<T>{
    public int getCurrentSize();
    public boolean isFull();
    public boolean isEmpty();
    public boolean add(T newEntry);
    public T remove();
    public boolean remove(T anEntry);
    public void clear();
    public int getFrequencyOf(T anEntry);
    public boolean contains(T anEntry);
    public T[] toArray();
    
    public BagInterface<T> union(BagInterface<T> otherBag);
    public BagInterface<T> intersection(BagInterface<T> otherBag);
    public BagInterface<T> difference(BagInterface<T> otherBag);
    public boolean isSubsetOf(BagInterface<T> otherBag);
}
