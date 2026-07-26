/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Node<T>{
    T data;
    Node<T> next;
    
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
