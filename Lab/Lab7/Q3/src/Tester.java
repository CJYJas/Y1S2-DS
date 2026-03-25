/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Infix Expression : ");
        String postfix = input.nextLine();
        
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertTree(postfix);
        
        System.out.print("The tree elements - INORDER : ");
        tree.inorder();
        System.out.print("The tree elements - PREORDER : ");
        tree.preOrder();
        System.out.print("The tree elements - POSTORDER : ");
        tree.postOrder();
    }  
}
