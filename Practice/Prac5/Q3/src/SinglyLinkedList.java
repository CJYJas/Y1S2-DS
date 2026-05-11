/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class SinglyLinkedList<T>{
    private Node head;
    private int size;
    
    public SinglyLinkedList(){
        this.head = null;
    }
    
    public void add(T val){
        Node<T> newNode = new Node<>(val);
        
        if(head == null){
            head = newNode;
            size ++;
            return;
        }
        
        Node<T> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        curr.next = newNode;
        size ++;
    }
    
    public void swapNodes(int index1, int index2){
        if(index1 == index2) return;
        
        Node<T> prevA = null; 
        Node<T> currA = null; 
        Node<T> prevB = null; 
        Node<T> currB = null;
        
        Node<T> curr = head;
        for(int i = 0; i <= index2; i++){
            if(i == index1 - 1){prevA = curr;}
            if(i == index2 - 1){prevB = curr;}
            if(i == index1){currA = curr;}
            if(i == index2){currB = curr;}
            
            curr = curr.next;
        }
        
        if(prevA == null){
            head = currB;
        }else{
            prevA.next = currB;
        }
        
        if(prevB != currA){
            prevB.next = currA;
        }
        
        Node<T> temp = currA.next;
        currA.next = currB.next;
        
        if(prevB == currA){
            currB.next = currA;
        }else{
            currB.next = temp;
        }
    }
}


