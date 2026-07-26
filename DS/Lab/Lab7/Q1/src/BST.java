/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class BST<E extends Comparable<E>> extends AbstractTree<Integer>{
    private TreeNode<Integer> root;
    
    public BST(Integer[] list){
        for(Integer item : list){
            insert(item);
        }
    }
    
    @Override
    public int searchFrequency(Integer e) {
        TreeNode<Integer> current = root;
        int freq = 0;
        while(current != null){
            if(e.compareTo(current.getElement()) < 0){
                current = current.getLeft();
            }else if(e.compareTo(current.getElement()) > 0){
                current = current.getRight();
            }else{
                freq ++;
                current = current.getRight();
            }
        }
        
        return freq;
    }

    @Override
    public boolean insert(Integer e) {
        TreeNode<Integer> newNode = new TreeNode<>(e);
        
        if(root == null){
            root = newNode;
        }else{
            TreeNode<Integer> curr = root;
            TreeNode<Integer> parent = null;

            while(curr != null){
                if(e.compareTo(curr.getElement()) < 0){
                    parent = curr;
                    curr = curr.getLeft();
                }else{
                    parent = curr;
                    curr = curr.getRight();
                }
            }

            if(e.compareTo(parent.getElement()) < 0){
                parent.setLeft(newNode);
            }else{
                parent.setRight(newNode);
            }
        
        }
        size ++;
        return true;
    }

    @Override
    public boolean delete(Integer e) {
        TreeNode<Integer> parent = null;
        TreeNode<Integer> curr = root;
        
        while(curr != null){
            if(e.compareTo(curr.getElement()) < 0){
                parent = curr;
                curr = curr.getLeft();
            }else if(e.compareTo(curr.getElement()) > 0){
                parent = curr;
                curr = curr.getRight();
            }else{
                break;
            }
        }
        
        if(curr == null){
            return false;
        }
        
        if(curr.getLeft() == null){
            if(parent == null){
                root = curr.getRight();
            }else{
                if(e.compareTo(parent.getElement()) < 0){
                    parent.setLeft(curr.getRight());
                }else{
                    parent.setRight(curr.getRight());
                }
            }
        }else{
            TreeNode<Integer> parentOfRightMost = curr;
            TreeNode<Integer> rightMost = curr.getLeft();
            
            while(rightMost.getRight() != null){
                parentOfRightMost = rightMost;
                rightMost = rightMost.getRight();
            }
            
            curr.setElement(rightMost.getElement());
            
            if(parentOfRightMost.getRight() == rightMost){
                parentOfRightMost.setRight(rightMost.getLeft());
            }else{
                parentOfRightMost.setLeft(rightMost.getLeft());
            }
        }
        
        size --;
        return true;
    }

    @Override
    public void inOrder() {
        inOrder(root);
        System.out.println("");
    }
    
    private void inOrder(TreeNode<Integer> root){
        if(root == null) return;
        
        inOrder(root.getLeft());
        System.out.print(root.getElement() + " --> ");
        inOrder(root.getRight());
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }
    
    private void preOrder(TreeNode<Integer> root){
        if(root == null) return;
        
        System.out.print(root.getElement() + " --> ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    @Override
    public void postOrder() {
        postOrder(root);
    }
    
    private void postOrder(TreeNode<Integer> root){
        if(root == null)return;
        
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getElement() + " --> ");
    }
    
    public Integer getMinimum() {
        if (root == null)
            return null;

        TreeNode<Integer> current = root;

        while (current.getLeft() != null) {
            current = current.getLeft();
        }

        return current.getElement();
    }
    
    public Integer getMaximum() {
        if (root == null)
            return null;

        TreeNode<Integer> current = root;

        while (current.getRight() != null) {
            current = current.getRight();
        }

        return current.getElement();
    }
    
    public Integer getTotal(){
        Integer total = postOrderTotal(root);
        
        return total;
    }
    
    private int postOrderTotal(TreeNode<Integer> root) {
        if (root == null)
            return 0;

        return postOrderTotal(root.getLeft())
             + postOrderTotal(root.getRight())
             + root.getElement();
    }
}
