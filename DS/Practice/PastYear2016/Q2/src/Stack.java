/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Stack<E>{
    private Node<E> head;
    
    public Stack(){
        this.head = null;
    }
    
    public void push(E element){
        Node<E> newElement = new Node<>(element);
        
        if(head == null){
            head = newElement;
            return;
        }
        
        newElement.setNext(head);
        head = newElement;
    }
    
    public E peek(){
        return head.getElement();
    }
    
    public E pop(){        
        E element = head.getElement();
        head = head.getNext();
        
        return element;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
}
