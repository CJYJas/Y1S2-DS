/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Stack;
public class BinarySearchTree {
    Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public void insertTree(String postfix){
        Stack<Node> stack = new Stack<>();
        
        char[] tokens = postfix.toCharArray();
        
        for(char c : tokens){
            System.out.print(c);
            Node newNode = new Node(c);
            
            if(isOperator(c)){
                newNode.right = stack.pop();
                newNode.left = stack.pop();
            }
            stack.push(newNode);
        }
        
        this.root = stack.pop();
    }
    
    private boolean isOperator(char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    
    public void inorder(){
        inOrderRec(root);
        System.out.println("");
    }
    
    private void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.value + " -> ");
            inOrderRec(root.right);
        }
    }
    
    public void preOrder(){
        preOrderRec(root);
        System.out.println("");
    }
    
    private void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.value + " -> ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    
    public void postOrder(){
        postOrderRec(root);
        System.out.println("");
    }
    
    private void postOrderRec(Node root){
        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.value + " -> ");
        }
    }
    
    public int getMinimumValue(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        
        int leftMin = getMinimumValue(root.left);
        int rightMin = getMinimumValue(root.right);
        
        return Math.min(Math.min(leftMin, rightMin), root.value);
    }
    
    public int getMaximumValue(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        
        int leftMax = getMaximumValue(root.left);
        int rightMax = getMaximumValue(root.right);
        
        return Math.max(Math.max(leftMax, rightMax), root.value);
    }
    
    public int getTotalValue(Node root){
        if(root == null){
            return 0;
        }
        
        int leftSum = getTotalValue(root.left);
        int rightSum = getTotalValue(root.right);
        
        return root.value + leftSum + rightSum;
    }
}



