/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Node<T>{
    private T element;
    private Node<T> next;
    
    public Node(T element){
        this.element = element;
        this.next = null;
    }
    
    public T getElement(){
        return this.element;
    }
    
    public Node<T> getNext(){
        return this.next;
    }
    
    public void setElement(T element){
        this.element = element;
    }
    
    public void setNext(Node<T> next){
        this.next = next;
    }
}
