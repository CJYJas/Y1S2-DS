/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tester{
    public static void main(String[] args) {
        Node<Character> head;
        Node<Character> tail;
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');
        
        head = node1;
        tail = node2;
        head.next = tail;
    }
}
