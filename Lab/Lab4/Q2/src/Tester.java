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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = input.nextLine();
        
        LinkedList l1 = new LinkedList();
        
        char[] character = word.toCharArray();
        
        for(char c : character){
            l1.originalList(c);
        }
        
        System.out.print("The original list : ");
        l1.display();
        
        LinkedList l2FirstHalf = new LinkedList();
        LinkedList l2SecondHalf = new LinkedList();
        l1.splitList(l2FirstHalf, l2SecondHalf);
        
        System.out.println("Split the list into two");
        System.out.print("First List : ");
        l2FirstHalf.display();
        System.out.print("Second List : ");
        l2SecondHalf.display();
        
        System.out.println("Split the list by alternating the nodes");
        LinkedList l3FirstHalf = new LinkedList();
        LinkedList l3SecondHalf = new LinkedList();
        l1.alternateList(l3FirstHalf, l3SecondHalf);
        
        System.out.println("Split the list into two");
        System.out.print("First List : ");
        l3FirstHalf.display();
        System.out.print("Second List : ");
        l3SecondHalf.display();
        
        System.out.println("Merge First List and Second List by alternating the nodes");
        LinkedList mergedList = new LinkedList();
        mergedList.mergeList(mergedList, l3FirstHalf, l3SecondHalf);
        mergedList.display();
        
        System.out.println("Reverse the list.Recursive method in the LinkedList");
        LinkedList reversedList = new LinkedList();
        ListNode curr = l1.head;
        reversedList.recursiveMethod(reversedList, curr);
        reversedList.display();
        
        System.out.println("Reverse the list.Recursive method in tester class");
        LinkedList reversedBackList = new LinkedList();
        ListNode curr2 = reversedList.head;
        reversedMethod(reversedBackList, curr2);
        reversedBackList.display();
    }    
    
    public static void reversedMethod(LinkedList mergedList, ListNode curr){
        if(curr == null){
            return;
        }
        
        reversedMethod(mergedList, curr.next);
        mergedList.originalList(curr.data);
    }
}
