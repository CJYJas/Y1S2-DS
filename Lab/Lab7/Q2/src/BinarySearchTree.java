/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BinarySearchTree {
    Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public void insert(String word){
        root = insertTree(root, word);
    }
    
    private Node insertTree(Node root, String word){
        if(root == null){
            root = new Node(word);
            return root;
        }
        
        int comparison = word.compareTo(root.value);
        
        if(comparison < 0){
            root.left = insertTree(root.left, word);
        }else if(comparison > 0){
            root.right = insertTree(root.right, word);
        }else{
            root.frequency ++;
        }
        
        return root;
    }
    
    public void inorder(){
        inOrderRec(root);
        System.out.println("");
    }
    
    private void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.println("000" + root.frequency + " " + root.value + " --> ");
            inOrderRec(root.right);
        }
    }
}
