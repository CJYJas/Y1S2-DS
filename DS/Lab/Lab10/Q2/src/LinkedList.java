/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LinkedList {
    private Node head;
    
    public LinkedList(){
        this.head = null;
    }
    
    public void addLast(int element){
        Node newNode = new Node(element);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        Node curr = head;
        while(curr.getNext() != null){
            curr = curr.getNext();
        }
        
        curr.setNext(newNode);
    }
    
    public void printLinkedList(){
        if(head == null){
            return;
        }
        
        System.out.print("The random integers are : ");
        Node curr = head;
        while(curr != null){
            System.out.print(curr.getElement() + " --> ");
            curr = curr.getNext();
        }
        System.out.println("");
    }
    
    public Node getHead(){
        return this.head;
    }
}
