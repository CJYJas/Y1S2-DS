/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class MyStack<T extends Comparable<T>>{
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
    
    public void sortStack(MyStack<T> s){
        if(s.isEmpty()){
            return;
        }
        
        T temp = s.pop();
        sortStack(s);
        sortInserted(s, temp);
    }
    
    public void sortInserted(MyStack<T> s, T element){
        if(s.isEmpty() || element.compareTo(s.peek()) < 0){
            s.push(element);
            return;
        }
        
        T temp = s.pop();
        sortInserted(s, element);
        s.push(temp);
    }
    
    public void printStack(){   
        Node<T> curr = head;
        System.out.println("Element in Stack");
        while(curr != null){
            T value = curr.val;
            System.out.print(value + ",");
            curr = curr.next;
        }
        System.out.println("");
    }
}



