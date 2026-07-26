/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class MyStack<E>{
    Node<E> head;
    
    public MyStack(){
        this.head = null;
    }
    
    public void push(E item){
        Node<E> newNode = new Node(item);
        if(head == null){
            head = newNode;
            return;
        }
        
        Node<E> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        curr.next = newNode;
    }
    
    public E pop(){
        if(head == null){
            return null;
        }
        
        if (head.next == null) {
            E val = head.val;
            head = null;
            return val;
        }
        
        Node<E> curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        
        E popValue = (E) curr.next.val;
        curr.next = null;
        
        return popValue;
    }
    
    public E peek(){
        if(head == null){
            return null;
        }
        
        Node<E> curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        
        E popValue = (E) curr.next.val;
        
        return popValue;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void display(MyStack<E> list){
        if(head == null){
            return;
        }
        
        Node<E> current = head; 
    
        // Walk through the nodes without popping them
        while (current != null) {
            System.out.print(" <-- " + current.val);
            current = current.next; // Move to the next item
        }
        System.out.println("");
    }
}
