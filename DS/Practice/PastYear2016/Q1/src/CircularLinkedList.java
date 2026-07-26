/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CircularLinkedList<E>{
    private Node<E> head;
    private int size;
    
    public CircularLinkedList(){
        this.head = null;
    }
    
    public void Insert(E element){
        Node<E> newElement = new Node<>(element);
        
        if(head == null){
            head = newElement;
            head.setNext(head);
            size ++;
            return;
        }
        
        Node<E> curr = head;
        while(curr.getNext() != head){
            curr = curr.getNext();
        }
        
        curr.setNext(newElement);
        newElement.setNext(head);
        size ++;
    }
    
    public E getElement(E currentPosition, int repeat){ 
        Node<E> curr = findCurrentElement(currentPosition);
        
        int optimizedStep = (repeat % size + size) % size;
        for(int i = 0; i < optimizedStep; i++){
            curr = curr.getNext();
        }
        
        return curr.getElement();
    }
    
    private Node<E> findCurrentElement(E currentPosition){
        if(head == null){
            return null;
        }
        
        Node<E> curr = head;
        do{
            if(curr.getElement().equals(currentPosition)){
                return curr;
            }
            
            curr = curr.getNext();
        }while(curr != head);
        
        return null;
    }
}
