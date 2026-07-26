/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LinkedStack<T>{
   private Node<T> top;
   
   public LinkedStack(){
       top = null;
   }
   
   public void push(T item){
       Node<T> newNode = new Node<>(item);
       newNode.next = top;
       top = newNode;
   }
   
   public T pop(){
       if(isEmpty()){
        return null;
       }
       
       T value = top.data;
       top = top.next;
       return value;
   }
   
   public T peek(){
       if(isEmpty()){
           return null;
       }
       
       return top.data;
   }
   
   public boolean isEmpty(){
       return top == null;
   }
}
