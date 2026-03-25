/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Node {
    int value;
    int frequency;
    Node left, right;
    
    public Node(int value){
        this.value = value;
        left = null;
        right = null;
        this.frequency = 1;
    }
}
