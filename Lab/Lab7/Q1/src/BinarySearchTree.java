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
    int totalCount = 0;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public void insert(int value){
        root = insertRecursive(root, value);
    }
    
    private Node insertRecursive(Node root, int value){
        if(root == null){
            root = new Node(value);
            totalCount ++;
            return root;
        }
        
        if(value < root.value){
            root.left = insertRecursive(root.left, value);
        }else{
            root.right = insertRecursive(root.right, value);        
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
    
    public int countOccurance(int target){
        Node current = root;
        int count = 0;
        
        while(current != null){
            if(target < current.value){
                current = current.left;
            }else if(target > current.value){
                current = current.right;
            }else{
                count ++;
                current = current.right;
            }
        }
        return count;
    }
}

