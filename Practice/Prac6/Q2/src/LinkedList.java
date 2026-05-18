/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class LinkedList<T>{
    private Node<T> head;
    
    public LinkedList(){
        this.head = null;
    }
    
    public void addLast(T element){
        Node<T> newNode = new Node<>(element);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        Node<T> curr = head;
        while(curr.getNext() != null){
            curr = curr.getNext();
        }
        
        curr.setNext(newNode);
    }
    
    public void zipMerge(){
        Node<T> firstHalf = head;
        Node<T> secondHalf;
        
        Node<T> slow = head;
        Node<T> fast = head;
        
        while(fast.getNext() != null && fast.getNext().getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        
        secondHalf = slow.getNext();
        slow.setNext(null);
        
        secondHalf = reverseSecondHalf(secondHalf);
        head = interleave(firstHalf, secondHalf);
    }
    
    private Node<T> reverseSecondHalf(Node<T> secondHalf){
        Node<T> curr = secondHalf;
        Node<T> prev = null;
        Node<T> next = null;
        
        while(curr != null){
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    private Node<T> interleave(Node<T> firstHalf, Node<T> secondHalf){
        Node<T> dummy = new Node<>(null);
        dummy.setNext(firstHalf);
        Node<T> currFirst = firstHalf;
        Node<T> currSecond = secondHalf;
        
        while(currSecond != null){
            Node<T> firstNext = currFirst.getNext();
            Node<T> secondNext = currSecond.getNext();
            
            currFirst.setNext(currSecond);
            currSecond.setNext(firstNext);
            
            currFirst = firstNext;
            currSecond = secondNext;
        }
        
        return dummy.getNext();
    }
    
    public void printList(){
        if(head == null){
            System.out.println("Empty Linked List");
            return;
        }
        
        Node<T> curr = head;
        System.out.print("Elements in Linked List : ");
        while(curr != null){
            System.out.print(curr.getElement() + " -> ");
            curr = curr.getNext();
        }
        System.out.println("");
    }
}
