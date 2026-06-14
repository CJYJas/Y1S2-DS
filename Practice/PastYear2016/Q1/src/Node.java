/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Node<E>{
    private E element;
    private Node next;
    
    public Node(E element){
        this.element = element;
        this.next = null;
    }
    
    public E getElement(){
        return this.element;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setElement(E element){
        this.element = element;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
}
