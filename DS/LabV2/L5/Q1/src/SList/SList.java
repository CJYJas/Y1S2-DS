/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author User
 * @param <E>
 */
public class SList<E>{
    SNode<E> head;
    
    public SList(){
        this.head = null;
    }
    
    public void appendEnd(E e){
        if(head == null){
            head = new SNode(e);
            return;
        }
        
        SNode<E> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        curr.next = new SNode(e);
    }
    
    public E removeInitial(){
        if(head == null){
            return null;
        }
        
        SNode<E> temp = head;
        head = head.next;
        
        return temp.element;
    }
    
    public boolean contains(E e){
        if(head == null){
            return false;
        }
        
        SNode<E> curr = head;
        
        while(curr != null){
            if(curr.element.equals(e)){
                return true;
            }
            curr = curr.next;
        }
        
        return false;
    }
    
    public void clear(){
        this.head = null;
        System.out.println("The list is now empty");
    }
    
    public void display(){
        SNode<E> curr = head;
        
        while(curr != null){
            System.out.print(curr.element + " --> ");
            curr = curr.next;
        }
        System.out.println("");
    }
}
