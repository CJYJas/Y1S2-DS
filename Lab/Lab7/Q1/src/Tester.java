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
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        
        Integer[] list = new Integer[10];
        for(int i = 0; i < 10; i++){
            list[i] = rand.nextInt(21);
        }
        BST<Integer> binarySearchTree = new BST<>(list);
        
        System.out.print("The random numbers are ");
        for(Integer i : list){
            System.out.print(i + " ");
            binarySearchTree.insert(i);
        }
        System.out.println("");
        
        System.out.println("The number of unique elements in the tree : " + binarySearchTree.getSize());
        System.out.print("The tree elements - PREORDER : ");
        binarySearchTree.preOrder();
        System.out.println("");
        System.out.print("The tree elements - INORDER : ");
        binarySearchTree.inOrder();
        System.out.print("The tree elements - POSTORDER : ");
        binarySearchTree.postOrder();
        System.out.println("");
        
        System.out.println("The minimum number is : " + binarySearchTree.getMinimum());
        System.out.println("The maximum number is : " + binarySearchTree.getMaximum());
        System.out.println("The total is : " + binarySearchTree.getTotal());
    
        System.out.print("Enter a number to search : ");
        int search = input.nextInt();
        System.out.println("The number of occurrence of " + search + " is " + binarySearchTree.searchFrequency(search));
    }
}
