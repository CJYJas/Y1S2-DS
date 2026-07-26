/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author User
 * @param <E>
 */
public class SNode<E>{
    SNode<E> next;
    E element;
    
    public SNode(){
        this.element = null;
        this.next = null;
    }
    
    public SNode(E element){
        this.element = element;
        this.next = null;
    }
}
