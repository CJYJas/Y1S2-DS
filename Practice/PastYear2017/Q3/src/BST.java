/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
import java.util.*;
public class BST<E extends Comparable<E>>{
    private Node<E> root;
    
    public BST(){
        this.root = null;
    }
    
    public boolean add(Node<E> node, E item){
        if(root == null){
            root = node;
            return true;
        }
        
        Node<E> curr = root;
        Node<E> parent = root;
        
        while(curr != null){
            if(item.compareTo(curr.getNodeInfo()) < 0){
                parent = curr;
                curr = curr.getLeft();
            }else if(item.compareTo(curr.getNodeInfo()) > 0){
                parent = curr;
                curr = curr.getRight();
            }else{
                return false;
            }
        }
        
        if(item.compareTo(parent.getNodeInfo()) < 0){
            parent.setLeft(node);
        }else if(item.compareTo(parent.getNodeInfo()) > 0){
            parent.setRight(node);
        }else{
            return false;
        }
        
        return true;
    }
    
    public boolean contains(E item){
        if(root == null){
            return false;
        }
        
        Node<E> curr = root;
        while(curr != null){
            if(item.compareTo(curr.getNodeInfo()) < 0){
                curr = curr.getLeft();
            }else if(item.compareTo(curr.getNodeInfo()) > 0){
                curr = curr.getRight();
            }else{
                return true;
            }
        }
        
        return false;
    }
    
    public void printTreeInOrder(){
        if(root == null){
            return;
        }
        
        Stack<Node<E>> stack = new Stack<>();
        Node<E> curr = root;
        
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.getLeft();
            }
            
            curr = stack.pop();
            System.out.println(curr.getNodeInfo() + ", ");
            
            curr = curr.getRight();
        }
    }

}
