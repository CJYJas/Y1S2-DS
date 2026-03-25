/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Node {
    Node left;
    Node right;
    String value;
    int frequency;
    
    public Node(String value){
        this.value = value;
        right = null;
        left = null;
        frequency = 1;
    }
}
