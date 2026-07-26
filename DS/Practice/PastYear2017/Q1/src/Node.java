/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class Node<E>{
    private E object;
    private Node<E> next;
    
    public Node(E object){
        this.object = object;
        this.next = null;
    }
    
    public E getObject(){
        return this.object;
    }
    
    public Node<E> getNext(){
        return this.next;
    }
    
    public void setObject(E object){
        this.object = object;
    }
    
    public void setNext(Node<E> next){
        this.next = next;
    }
}
