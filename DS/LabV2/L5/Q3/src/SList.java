/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class SList<E>{
    private SNode<E> head;
    private int size = 0;
    
    public SList(){
        this.head = null;
    }
    
    public void addFirst(E element){
        SNode<E> newNode = new SNode(element);
        
        if(head == null){
            head = newNode;
            size ++;
            return;
        }
        
        SNode<E> temp = head;
        head = newNode;
        newNode.next = temp;
        temp.prev = head;
        size ++;
    }
    
    public void addLast(E element){
        if(head == null){
            addFirst(element);
            return;
        }
        
        SNode<E> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        SNode<E> newNode = new SNode(element);
        curr.next = newNode;
        newNode.prev = curr;
        size ++;
    }
    
    public void addElement(int index, E element){
        if(head == null || index == 0){
            addFirst(element);
            return;
        }
        
        if(index == size){
            addLast(element);
            return;
        }
        
        SNode<E> curr = head;
        for(int i = 0; i < index - 1; i++){
            curr = curr.next;
        }
        
        SNode<E> temp = curr.next;
        SNode<E> newNode = new SNode(element);
        
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = temp;
        if(temp != null){
            temp.prev = newNode;
        }
        
        size ++;
    }
    
    public void removeElement(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        
        SNode<E> curr = head;
        
        if(index == 0){
            head = head.next;
            head.prev = null;
            size --;
            return;
        }
        
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        
        curr.prev.next = curr.next;
        if(curr.next != null){
            curr.next.prev = curr.prev;
        }
        
        size --;
    }
    
    public void traverseFoward(){
        SNode<E> curr = head;
        
        while(curr != null){
            System.out.print(curr.element + " ");
            curr = curr.next;
        }
        System.out.println("");
    }
    
    public void traverseBackward(){
        SNode<E> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        while(curr != null){
            System.out.print(curr.element + " ");
            curr = curr.prev;
        }
        System.out.println("");
    }
    
    public int getSize(){
        return size;
    }
    
    public void clear(){
        this.head = null;
        size = 0;
    }
}
