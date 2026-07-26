/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Infix Expression : ");
        String expression = input.nextLine();
        Character[] elements = new Character[expression.length()];

        for (int i = 0; i < expression.length(); i++) {
            elements[i] = expression.charAt(i);
        }
        BSTExpression<Character> tree = new BSTExpression(elements);
        
        System.out.println("The number of elements in the tree is : " + tree.getSize());
        System.out.print("The tree elements - PREORDER : ");
        tree.preOrder();
        System.out.println("");
        System.out.print("The tree elements - INORDER : ");
        tree.inOrder();
        System.out.print("The tree elements - POSTORDER : ");
        tree.postOrder();
        System.out.println("");
    }
    
}
