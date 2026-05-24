
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
interface BagInterface<T>{
    public boolean add(T newEntry);
    public int getFrequencyOf(T anEntry);
    public BagInterface<T> intersection(BagInterface<T> anotherBag);
    public void remove(T anEntry, ArrayList<T> arrayBag);
}
