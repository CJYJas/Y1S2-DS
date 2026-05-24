/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class AdvancedDList<E>{
    private DNode<E> head;
    private DNode<E> tail;
    private int size;
    
    public AdvancedDList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addAtIndex(int index, E e){
        if(index >= size){
            addLast(e);
            return;
        }
        
        if(index == 0){
            addFirst(e);
            return;
        }
        
        DNode<E> temp = head;
        
        for(int i = 0; i < index - 1; i++){
            temp = temp.getNext();
        }
        
        DNode<E> newNode = new DNode<>(e);
        DNode<E> replaced = temp.getNext();
        
        temp.setNext(newNode);
        newNode.setPrev(temp);
        
        newNode.setNext(replaced);
        if(replaced != null){
            replaced.setPrev(newNode);
        }
        
        size ++;
    }
    
    private void addLast(E e){
        DNode<E> newNode = new DNode<>(e);
        
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size ++;
    }
    
    private void addFirst(E e){
        DNode<E> newNode = new DNode<>(e);
        
        if(size == 0){
             head = newNode;
            tail = newNode;
        }else{
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size ++;
    }
    
    public E removeInitial(){
        if(head == null){
            return null;
        }
        
        DNode<E> initial = head;
        
        if(head == tail){
            head = null;
            tail = null;
        }else{
            head = head.getNext();
            head.setPrev(null);
        }
        
        size --;
        
        return initial.getElement();
    }
    
    public void replaceAll(E oldE, E newE){
        if(head == null){
            return;
        }
        
        DNode<E> temp = head;
        while(temp != null){
            if(temp.getElement().equals(oldE)){
                temp.setElement(newE);
            }
            temp = temp.getNext();
        }
    }
    
    public E getAbsoluteMiddleValue(){
        if(head == null){
            return null;
        }
        
        int middle = size / 2;
        
        DNode<E> temp = head;
        for(int i = 0; i < middle; i++){
            temp = temp.getNext();
        }
        
        return temp.getElement();
    }
    
    public int getSize(){
        return size;
    }
    
    public void displayList(){
        DNode<E> temp = head;
        System.out.print("Elements in Doubly Lined List : ");
        while(temp != null){
            System.out.print(temp.getElement() + " <--> ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
}
