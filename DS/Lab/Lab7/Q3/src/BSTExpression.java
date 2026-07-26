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
public class BSTExpression<E>{
    private TreeNode<E> root;
    private int size = 0;
    
    public BSTExpression(E[] list){
        root = insert(list);
    }
    
    public int getSize(){
        return this.size;
    }
    
    public TreeNode<E> insert(E[] list){
        if (list.length == 0) {
            return null;
        }
        
        list = stripOutermostParentheses(list);
        
        if (list.length == 1) {
            size++;
            return new TreeNode<>(list[0]);
        }
        
        int operatorIndex = findMainOperatorIndex(list);
        
        if (operatorIndex == -1) {
            size++;
            return new TreeNode<>(list[0]);
        }
        
        TreeNode<E> root = new TreeNode<>(list[operatorIndex]);
        size ++;
        E[] leftTokens = Arrays.copyOfRange(list, 0, operatorIndex);
        E[] rightTokens = Arrays.copyOfRange(list, operatorIndex + 1, list.length); 
        
        root.setLeft(insert(leftTokens));
        root.setRight(insert(rightTokens));
        
        return root;
    }
    
    private int findMainOperatorIndex(E[] list){
        int bestIndex = -1;
        int bestPrecedence = -1; 
        
        int parenthesisDepth = 0; // Tracks our current nesting level
        
        for(int i = 0; i < list.length; i++){
            E token = list[i];
            
            // 1. Keep track of current parenthesis depth
            if (token.equals('(')) {
                parenthesisDepth++;
                continue; // Skip processing this token as an operator
            } else if (token.equals(')')) {
                parenthesisDepth--;
                continue; // Skip processing this token as an operator
            }
            
            // 2. CRITICAL: Only consider operators at the shallowest level (depth == 0)
            if (parenthesisDepth == 0) {
                int currentPrecedence = -1;
                if (token.equals('+') || token.equals('-')) {
                    currentPrecedence = 1;
                } else if (token.equals('*') || token.equals('/')) {
                    currentPrecedence = 2;
                }
                
                if (currentPrecedence != -1) {
                    if (bestIndex == -1 || currentPrecedence < bestPrecedence || 
                       (currentPrecedence == bestPrecedence && currentPrecedence == 1)) {

                        bestPrecedence = currentPrecedence;
                        bestIndex = i;
                    } 
                    // Handle right-to-left evaluation priorities for equal high-tier operators (*, /)
                    else if (currentPrecedence == bestPrecedence && currentPrecedence == 2) {
                        bestPrecedence = currentPrecedence;
                        bestIndex = i;
                    }
                }
            }
        }
        
        return bestIndex;
    }
    
    private E[] stripOutermostParentheses(E[] list) {
        while (list.length > 1 && list[0].equals('(') && list[list.length - 1].equals(')')) {
            // Verify if these specific outer parentheses actually match each other
            int count = 0;
            boolean isMatched = true;
            
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].equals('(')) count++;
                if (list[i].equals(')')) count--;
                
                // If count hits 0 before the end, the first '(' matched an earlier ')'
                // Example of fake match: (1 + 2) * (3 + 4) -> do NOT strip!
                if (count == 0) {
                    isMatched = false;
                    break;
                }
            }
            
            // If they are a true matching pair wrapping the whole expression, slice them off
            if (isMatched) {
                list = Arrays.copyOfRange(list, 1, list.length - 1);
            } else {
                break; // They don't match each other, stop stripping
            }
        }
        return list;
    }
    
    public void inOrder() {
        inOrder(root);
        System.out.println("");
    }
    
    private void inOrder(TreeNode<E> root){
        if(root == null) return;
        
        inOrder(root.getLeft());
        System.out.print(root.getElement() + " <-- ");
        inOrder(root.getRight());
    }

    public void preOrder() {
        preOrder(root);
    }
    
    private void preOrder(TreeNode<E> root){
        if(root == null) return;
        
        System.out.print(root.getElement() + " <-- ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void postOrder() {
        postOrder(root);
    }
    
    private void postOrder(TreeNode<E> root){
        if(root == null)return;
        
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getElement() + " <-- ");
    }
}
