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
        DoubleLinkedList oriList = new DoubleLinkedList();
        
        System.out.print("The random numbers are :");
        for(int i = 0; i < 10; i++){
            int num = rand.nextInt(101);
            System.out.print(num + " ");
            oriList.addLast(num);
        }
        System.out.println("");
        
        System.out.println("Insert the random numbers into the doubly linked list");
        oriList.display();
        
        System.out.println("Remove the number from the third position");
        oriList.removeElement(2, oriList);
        oriList.display();
        
        System.out.println("Replace the number in seventh position with 999");
        oriList.replaceElement(oriList, 6, 999);
        oriList.display();
        
        System.out.println("Remove all even number from the doubly linked list");
        oriList.removeEven(oriList);
        oriList.display();
    }  
}
