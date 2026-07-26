/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <Integer>
 */
public class Node{
    private final int element;
    private  Node next;
    
    public Node(int element){
        this.element = element;
        this.next = null;
    }
    
    public int getElement(){
        return this.element;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setNext(Node nextNode){
        this.next = nextNode;
    }
}
