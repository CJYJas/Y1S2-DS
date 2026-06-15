/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class Node<E>{
    private E nodeInfo;
    private Node<E> left;
    private Node<E> right;
    
    public Node(E nodeInfo){
        this.nodeInfo = nodeInfo;
        this.left = null;
        this.right = null;
    }
    
    public E getNodeInfo(){
        return this.nodeInfo;
    }
    
    public Node<E> getLeft(){
        return this.left;
    }
    
    public Node<E> getRight(){
        return this.right;
    }
    
    public void setNodeInfor(E nodeInfo){
        this.nodeInfo = nodeInfo;
    }
    
    public void setLeft(Node<E> left){
        this.left = left;
    }
    
    public void setRight(Node<E> right){
        this.right = right;
    }
}
