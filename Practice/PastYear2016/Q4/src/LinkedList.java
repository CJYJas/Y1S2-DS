/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LinkedList {
    private Node<Integer> head;
    
    public LinkedList(){
        this.head = null;
    }
    
    public void add(int element){
        Node<Integer> newNode = new Node<>(element);
        System.out.println("Adding : " + element);
        if(head == null){
            head = newNode;
            return;
        }
        
        Node<Integer> curr = head;
        while(curr.getNext() != null){
            curr = curr.getNext();
        }
        
        curr.setNext(newNode);
    }
    
    public void addAfter(int element, int prevElement){
        Node<Integer> curr = head;
        while(curr != null){
            if(curr.getElement().equals(prevElement)){
                System.out.println("Adding " + element + " after " + prevElement);
                Node<Integer> newNode = new Node<>(element);
                newNode.setNext(curr.getNext());
                curr.setNext(newNode);
                break;
            }
            
            curr = curr.getNext();
        }
        
        if(curr == null){
            System.out.println("Element ( " + prevElement + " ) not found...");
        }
    }
    
    public void deleteFront(){
        System.out.println("Deleting front : " + head.getElement());
        head = head.getNext();
    }
    
    public void deleteAfter(int prevElement){
        System.out.println("Testing deleteAfter:");
        Node<Integer> curr = head;
        
        while(curr != null){
            if(curr.getElement() == prevElement){
                break;
            }
            
            curr = curr.getNext();
        }
        
        if(curr == null){
            System.out.println("Element ( " + prevElement + " ) not found...");
            return;
        }
        
        System.out.println("After " + prevElement + " is " + curr.getNext().getElement() + " Deleting " + curr.getNext().getElement());
        curr.setNext(curr.getNext().getNext());
    }
    
    public void traverse(){
        if(head == null){
            System.out.println("No element in list");
            return;
        }
        
        Node<Integer> curr = head;
        System.out.println("Showing content of my linked list:");
        while(curr != null){
            System.out.print(curr.getElement() + " ");
            
            curr = curr.getNext();
        }
        System.out.println("");
    }
}
