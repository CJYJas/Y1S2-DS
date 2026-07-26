/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Logic<E>{
    Node<E> head;
    
    public Logic(){
        this.head = null;
    }
    
    public void addList(E element){
        Node<E> newNode = new Node<>(element);
        
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
    
    public boolean searchElement(E element){
        Node<E> curr = head;
        
        while(curr != null){
            if(curr.element.equals(element)){
                return true;
            }
            curr = curr.next;
        }
        
        return false;
    }
}


