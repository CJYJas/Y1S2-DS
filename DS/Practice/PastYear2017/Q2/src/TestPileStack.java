/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class TestPileStack {
    public static void main(String[] args) {
        System.out.println("Create a new stack : an empty pile of books");
        Scanner input = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();
        
        checkEmpty(stack);
        System.out.println("");
        
        System.out.println("Push 3 books to the pile");
        for(int i = 0; i < 3; i++){
            System.out.print("Enter book title " + (i + 1) + " :");
            String name = input.nextLine();
            stack.addTopElement(name);
            
        }
        
        System.out.println("The new books that you added are : " + stack.toString());
        
        System.out.println("The pile should not be empty");
        checkEmpty(stack);
        System.out.println("The pule has " + stack.getNumber() + " books");
        
        System.out.println("Get the top book and remove the top book");
        for(int i = 0; i < 3; i++){
            String topBook = stack.removeTopElement();
            System.out.println(topBook + " is at the top of the pile");
            System.out.println(topBook + " is removed from the pile");
            System.out.println("");
        }
        
        System.out.println("The pile should be empty");
        checkEmpty(stack);
    }
    
    private static void checkEmpty(GenericStack<String> stack){
        if(stack.isEmpty()){
            System.out.println("isEmpty() return true");
        }else{
            System.out.println("isEmpty() return false");
        }
    }
}
