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
    private int size;
    
    public SList(){
        this.head = null;
    }
    
    public void add(E e){
        if(head == null){
            head = new SNode(e);
            size ++;
            return;
        }
        
        SNode<E> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        curr.next = new SNode(e);
        size ++;
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
    
    public void removeElement(E e){
        if(!contains(e)){
            System.out.println("This student do not occurs.");
            return;
        }
        
        SNode<E> curr = head;
        
        while(curr != null){
            if(curr.next.element.equals(e)){
                curr.next = curr.next.next;
                size --;
                break;
            }else{
                curr = curr.next;
            }
        }
    }
    
    public void replace(E e, E newE){
        if(!contains(e)){
            System.out.println("This students do not occurs.");
            return;
        }
        
        SNode<E> curr = head;
        
        while(curr != null){
            if(curr.element.equals(e)){
                curr.element = newE;
                break;
            }else{
                curr = curr.next;
            }
        }
        
    }
    
     public void printList(){
        SNode<E> curr = head;
        
        while(curr != null){
            System.out.print(curr.element + ", ");
            curr = curr.next;
        }
        System.out.println("");
    }
     
    public int getSize(){
        return size;
    }
}
