/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MyStack<E>{
    Node<E> head;
    
    public MyStack(){
        this.head = null;
    }
    
    public void push(E element){
        Node<E> newNode = new Node<>(element);
        
        newNode.next = head;
        head = newNode;
    }
    
    public E pop(){
        if(head == null){
            return null;
        }

        E popValue = head.val;
        head = head.next;
            
        return popValue;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
}




