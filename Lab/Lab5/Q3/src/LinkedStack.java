
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <Position>
 */
public class LinkedStack<Position>{
   private Node<Position> top;

   public LinkedStack(){
       top = null;
   }
   
   public void push(Position item){
       Node<Position> newNode = new Node<>(item);
       newNode.next = top;
       top = newNode;
   }
   
   public Position pop(){
       if(isEmpty()){
        return null;
       }
       
       Position value = top.data;
       top = top.next;
       return value;
   }
   
   public Position peek(){
       if(isEmpty()){
           return null;
       }
       
       return top.data;
   }
   
   public boolean isEmpty(){
       return top == null;
   }
   
   public int getSize(){
    int count = 0;
    Node current = top;
    
    while(current != null){
        count ++;
        current = current.next;
    }
    
    return count;
   }
}
