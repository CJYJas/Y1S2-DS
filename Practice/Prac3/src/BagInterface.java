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
    public void add(T item);
    public void remove(T item);
    public T[] toArray();
    public boolean contain(T[] bag, T target);
    public BagInterface<T> union(BagInterface<T> otherBag);
    public BagInterface<T> difference(BagInterface<T> otherBag);
    public BagInterface<T> getSymmetricDifference(BagInterface<T> otherBag);
}
