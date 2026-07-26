/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MyStack<T>{
    Node<T> head;
    
    public MyStack(){
        this.head = null;
    }
    
    public void push(T element){
        Node<T> newNode = new Node<>(element);
        
        newNode.next = head;
        head = newNode;
    }
    
    public T pop(){
        if(head == null){
            return null;
        }

        T popValue = head.val;
        head = head.next;
            
        return popValue;
    }
    
    public T peek(){
        if(head == null){
            return null;
        }

        return head.val;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void printStack(){
        if(head == null){
            System.out.println("Error : Nothing to be printed");
            return;
        }
        
        Node<T> curr = head;
        System.out.print("Element in stack : ");
        while(curr != null){
            System.out.print(curr.val + ",");
            curr = curr.next;
        }
        System.out.println("");
    }
}


