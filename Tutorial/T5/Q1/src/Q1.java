/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class Q1<E>{
    Node<E> head;
    int size;
    
    public Q1(){
        this.head = null;
    }
    
    public E xyz(int index, E e){
        Node<E> current = head;
        Node<E> temp;
        
        if(head == null){
            head = new Node(e);
            size ++;
            return head.element;
        }
        
        if(index < 0 || index > size){
            return null;
        }else if(index == size){
            this.addLast(e);
            size ++;
            return null;
        }else if(index == 0){
            temp = head;
            head = new Node(e);
            head.next = temp;
            size ++;
            return temp.element;  
        }else{
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            temp = current.next;
            current.next = new Node(e);
            current.next.next = temp;
            size ++;
            return temp.element;
        }
    }
    
    public void addLast(E e){
        if(head == null){
            head = new Node(e);
            return;
        }
        
        Node<E> curr = head;
        
        for(int i = 0; i < size - 1; i++){
            curr = curr.next;
        }
        
        curr.next = new Node(e);
    }
}

