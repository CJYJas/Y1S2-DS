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
    
    public Logic(Node<E> node1, Node<E>node2){
        head = node1;
        tail = node2;
        this.head.next = node2;
        size += 2;
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
    
    public void removeFirst(){
        if(head == null){
            return;
        }
        
        head = head.next;
        
        if(head == null){
            tail = null;
        }
        
        size --;
    }
    
    public void removeLast(){
        if(head == null){
            return;
        }
        
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        
        Node<E> curr = head;
        while(curr.next != tail){
            curr = curr.next;
        }
        
        tail = curr;
        tail.next = null;
        size --;
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
    
    public void add(int index, E element){
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
    
    public void remove(int index){
        int currIndex = 0;
        
        if(size == 0){
            return;
        }
        
        if(index >= size - 1){
            removeLast();
            return;
        }
        
        if(index == 0){
            removeFirst();
            return;
        }
        
        Node<E> curr = head;
        while(currIndex + 1 != index){
            curr = curr.next;
            currIndex ++;
        }
        
        curr.next = curr.next.next;
        size --;
    }
}
