/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class DNode<E>{
    private E element;
    private DNode<E> next;
    private DNode<E> prev;
    
    public DNode(E element){
        this.element = element;
        this.next = null;
        this.prev = null;
    }
    
    public E getElement(){
        return this.element;
    }
    
    public DNode<E> getNext(){
        return this.next;
    }
    
    public DNode<E> getPrev(){
        return this.prev;
    }
    
    public void setElement(E element){
        this.element = element;
    }
    
    public void setNext(DNode<E> next){
        this.next = next;
    }
    
    public void setPrev(DNode<E> prev){
        this.prev = prev;
    }
}
