/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class Node<E>{
    Node<E> next;
    Node<E> prev;
    E element;
    
    public Node(E element){
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}
