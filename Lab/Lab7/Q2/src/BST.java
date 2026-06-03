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
    private TreeNode<E> root;
    private Map<E,Integer> freqMap = new HashMap<>();
    
    public BST(ArrayList<E> list){
        for(E item : list){
            insert(item);
        }
    }
    
    public void insert(E item){
        TreeNode<E> newNode = new TreeNode<>(item);
        
        if(root == null){
            root = newNode;
        }else{
            TreeNode<E> curr = root;
            TreeNode<E> parent = null;
            
            while(curr != null){
                if(item.compareTo(curr.getElement()) < 0){
                    parent = curr;
                    curr = curr.getLeft();
                }else if(item.compareTo(curr.getElement()) > 0){
                    parent = curr;
                    curr = curr.getRight();
                }else{
                    freqMap.put(item, freqMap.get(item) + 1);
                    return;
                }
            }
            
            if(item.compareTo(parent.getElement()) < 0){
                parent.setLeft(newNode);
            }else{
                parent.setRight(newNode);
            }
        }
        
         freqMap.put(item, 1);
    }
    
    public void inOrder(){
        inOrder(root);
    }
    
    private void inOrder(TreeNode<E> root){
        if(root == null) return;
        
        inOrder(root.getLeft());
        System.out.println("000" + freqMap.get(root.getElement()) + " " + root.getElement() + " --> ");
        inOrder(root.getRight());
    }
}
