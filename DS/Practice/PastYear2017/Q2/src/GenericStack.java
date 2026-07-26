/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
import java.util.*;
public class GenericStack<E> implements StackInterface<E>{
    private ArrayList<E> list;
    
    public GenericStack(){
        this.list = new ArrayList<>();
    }
    
    @Override
    public int getNumber() {
        return list.size();
    }

    @Override
    public E getTopElement() {
        return list.getLast();
    }

    @Override
    public E removeTopElement() {
        return list.removeLast();
    }

    @Override
    public void addTopElement(E element) {
        list.addLast(element);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
