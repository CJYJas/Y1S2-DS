/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Node<Position>{
    Position data;
    Node<Position> next;
    
    Node(Position data){
        this.data = data;
        this.next = null;
    }
}
