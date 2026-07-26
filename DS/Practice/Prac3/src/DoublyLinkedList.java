/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class DoublyLinkedList<T>{
    Node head;
    
    public DoublyLinkedList(){
        this.head = null;
    }
    
    public void add(T val){
        Node newNode = new Node(val);
        
        if(this.head == null){
            head = newNode;
            return;
        }
        
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        curr.next = newNode;
        newNode.next = null;
        newNode.prev = curr;
    }
    
    public void remove(Node remove){
        if(head == null){
            return;
        }
        
        Node curr = head;
        while(curr != null){
            if(curr.equals(remove)){
                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                } else {
                    head = curr.next; // We are removing the head
                }
                
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }
                return;
            }
            
            curr = curr.next;
        }
    }
    
    public void removeDuplicates(){
        if(head == null){
            return;
        }
        
        ArrayList<T> value = new ArrayList<>();
        
        Node curr = head;
        while(curr != null){
            if(value.contains((T)curr.val)){
                Node duplicate = curr;
                curr = curr.next;
                remove(duplicate);
                continue;
            }
            
            value.add((T)curr.val);
            curr = curr.next;
        }
    }
}
