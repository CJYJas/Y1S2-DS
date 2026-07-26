/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Node<E>{
    private E element;
    private Node<E> next;
    
    public Node(E element){
        this.element = element;
        this.next = null;
    }
    
    public E getElement(){
        return element;
    }
    
    public Node<E> getNext(){
        return next;
    }
    
    public void setElement(E element){
        this.element = element;
    }
    
    public void setNext(Node<E> next){
        this.next = next;
    }
}
