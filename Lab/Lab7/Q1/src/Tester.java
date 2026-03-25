/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        int[] list = {5, 16, 19, 18, 16, 17, 9, 0, 1, 9};
        BinarySearchTree tree = new BinarySearchTree();
        
        System.out.println("The random numbers are 5 16 19 18 16 17 9 0 1 9");
        
        for(int i : list){
            tree.insert(i);
        }
        Node root = tree.root;
        
        System.out.println("The number of elements in the tree : " + tree.totalCount);
        
        System.out.print("The tree elements - PREORDER : ");
        tree.preOrder();
        System.out.print("The tree elements - INORDER : ");
        tree.inorder();
        System.out.print("The tree elements - POSTORDER : ");
        tree.postOrder();
        
        System.out.println("The minimum number is " + tree.getMinimumValue(root));
        System.out.println("The maximum number is " + tree.getMaximumValue(root));
        System.out.println("The total is " + tree.getTotalValue(root));
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to search : ");
        int target = input.nextInt();
        System.out.println("The number of occurrence of " + target + " is " + tree.countOccurance(target));
    }   
}


