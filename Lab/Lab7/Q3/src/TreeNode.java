/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class TreeNode<E>{
    private E element;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode(E element){
        this.element = element;
    }
    
    public E getElement(){
        return this.element;
    }
    
    public TreeNode getLeft(){
        return this.left;
    }
    
    public TreeNode getRight(){
        return this.right;
    }
    
    public void setElement(E element){
        this.element = element;
    }
    
    public void setLeft(TreeNode<E> left){
        this.left = left;
    }
    
    public void setRight(TreeNode<E> right){
        this.right = right;
    }
}
