/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Node<T>{
    Node prev;
    Node next;
    T val;
    
    public Node(T val){
        this.next = null;
        this.prev = null;
        this.val = val;
    }
}
