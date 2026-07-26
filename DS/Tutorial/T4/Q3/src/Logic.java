/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Logic<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;
    
    public Logic(){
        this.head = null;
        this.tail = null;
    }
    
    public void addElement(E element){
        Node<E> newNode = new Node<>(element);
        
        if(head == null){
            head = newNode;
            tail = newNode;
            size ++;
            return;
        }
        
        Node<E> curr = head;
        while(curr.next != tail){
            curr = curr.next;
        }
        
        tail.next = newNode;
        tail = newNode;
        size ++;
    }
    
     public E getElement(int index){
        int currIndex = 0;
        
        if(size == 0 || index > size){
            return null;
        }
        
        Node<E> curr = head;
        
        while(currIndex != index){
            curr = curr.next;
            currIndex ++;
        }
        
        return curr.element;
    }
    
    public void addLast(E element){
        Node<E> newNode = new Node(element);
        
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;   
        size ++;
    }
    
    public void addFirst(Node<E> firstNode){
        if(head == null){
            head = firstNode;
            tail = firstNode;
        }else{
            firstNode.next = head;
            head = firstNode;
        }
        
        size ++;
    }

    public void setElement(int index, E element){
        Node<E> newNode = new Node<>(element);
        int currIndex = 0;
        
        if(size == 0 || index == 0){
            addFirst(newNode);
            return;
        }
        
        if(index >= size){
            addLast(element);
            return;
        }
        
        Node<E> curr = head;
        
        while(currIndex + 1 != index){
            curr = curr.next;
            currIndex ++;
        }
        
        newNode.next = curr.next;
        curr.next = newNode;
        size ++;
    }


    // Getter and setter for next
    public Node<E> getNext(int index) {
        int currIndex = 0;
        
        if(size == 0 || index > size){
            return null;
        }
        
        Node<E> curr = head;
        
        while(currIndex + 1 != index){
            curr = curr.next;
            currIndex ++;
        }
        
        return curr.next;
    }

    public void setNext(Node<E> nextNode, int index) {
        int currIndex = 0;
        
        if(size == 0 || index == 0){
            addFirst(nextNode);
            return;
        }
        
        if(index >= size){
            addLast(nextNode.element);
            return;
        }
        
        Node<E> curr = head;
        
        while(currIndex + 1 != index){
            curr = curr.next;
            currIndex ++;
        }
        
        nextNode.next = curr.next;
        curr.next = nextNode;
        size ++;

    }
}
