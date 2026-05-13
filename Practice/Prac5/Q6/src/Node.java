/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Node<E>{
    E val;
    Node next;
    
    public Node(){
        this.val = null;
        this.next = null;
    }
    
    public Node(E val){
        this.val = val;
        this.next = null;
    }
}