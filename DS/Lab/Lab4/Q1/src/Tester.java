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
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        
        System.out.println("The random numbers are : ");
        
        for(int i = 0; i < 10; i ++){
            int randNum = rand.nextInt(101);
            System.out.print(randNum + " ");
            list1.insertAtBack(randNum);
            list2.insertAtFront(randNum);
            list3.addSortNode(randNum);
        }
        
        System.out.println("Insert the random numbers at the back of the linked list");
        list1.display();
        System.out.println("Insert the random numbers at the front of the linked list");
        list2.display();
        System.out.println("Insert the random numbers in a sorted linked list");
        list3.display();
    }   
}
