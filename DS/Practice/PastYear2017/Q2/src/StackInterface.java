/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public interface StackInterface<E>{  
    public int getNumber();
    public E getTopElement();
    public E removeTopElement();
    public void addTopElement(E element);
    public boolean isEmpty();
}
