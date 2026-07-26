/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class Logic<E>{
    Node<E> head;
    Node<E> tail;
    int size = 0;
    
    public Logic(){
        this.head = null;
        this.tail = null;
    }
    
    public void addElement(int index, E element){
        if(index < 0 || index > size){
            return;
        }
        
        if(head == null){
            head = new Node(element);
            tail = head;
            size ++;
            return;
        }
        
        if(index == 0){
            addFirst(element);
            return;
        }
        
        if(index == size){
            addLast(element);
            return;
        }
        
        Node<E> curr = head;
        Node<E> newNode = new Node(element);
        
        for(int i = 0; i < index - 1; i++){
            curr = curr.next;
        }
        
        Node<E> temp = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = temp;
        temp.prev = newNode;
        size ++;
    }
    
    public void addFirst(E element){
        Node<E> temp = head;
        
        head = new Node(element);
        head.next = temp;
        temp.prev = head;
        
        size ++;
    }
    
    public void addLast(E element){
        Node<E> newNode = new Node(element);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        
        size ++;
    }
    
    public void display(){
        Node<E> curr = head;
        
        while(curr != null){
            E val = curr.element;
            System.out.print(val + " -> ");
            curr = curr.next;
        }
        System.out.println("");
    }
}
