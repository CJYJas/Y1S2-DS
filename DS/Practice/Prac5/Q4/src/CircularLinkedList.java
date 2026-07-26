/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CircularLinkedList<T>{
    Node<T> head;
    Node<T> tail;
    
    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    //its different because the next of tail will be head
    public void addLast(T element){
        Node<T> newNode = new Node(element);
        
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        tail.next = tail;
    }
    
    public boolean hasCycle(){
        
        Node<T> slow = head;
        Node<T> fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }
}
