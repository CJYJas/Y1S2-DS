/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Node<E>{
    Node next;
    E val;
    
    public Node(E val){
        this.next = null;
        this.val = val;
    }
}
