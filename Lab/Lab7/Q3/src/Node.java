/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Node {
    Node right;
    Node left;
    char value;
    
    public Node(char value){
        this.value = value;
        left = null;
        right = null;
    }
}
