/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class TreeNode<Integer>{
    private Integer element;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode(Integer e){
        this.element = e;
    }
    
    public Integer getElement(){
        return this.element;
    }
    
    public TreeNode getLeft(){
        return this.left;
    }
    
    public TreeNode getRight(){
        return this.right;
    }
    
    public void setElement(Integer e){
        this.element = e;
    }
    
    public void setLeft(TreeNode left){
        this.left = left;
    }
    
    public void setRight(TreeNode right){
        this.right= right;
    }
}
