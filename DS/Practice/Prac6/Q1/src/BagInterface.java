/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 *
**/
public interface BagInterface<T>{
    public int getCurrentSize();
    public boolean isEmpty();
    public boolean add(T newEntry);
    public int getFrequencyOf(T anEntry);
    public T[] toArray();
}
