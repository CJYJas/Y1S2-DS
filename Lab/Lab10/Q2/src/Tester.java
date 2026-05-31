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
        Random rand = new Random();
        
        int[] list = new int[10];
        for(int i = 0; i < 10; i++){
            list[i] = rand.nextInt(21);
        }
        
        LinkedList linkedList = new LinkedList();
        for(int i : list){
            linkedList.addLast(i);
        }
        linkedList.printLinkedList();
        
        System.out.println("Linear Search");
        System.out.print("Enter a number to search : ");
        int search = input.nextInt();
        linearSearch(linkedList, search);
        
        System.out.print("Enter two numbers to search (begin end");
        int begin = input.nextInt();
        int end = input.nextInt();
        linearSearchRange(linkedList, begin, end);
    }
    
    private static void linearSearch(LinkedList linkedList, int search){
        Node curr = linkedList.getHead();
        boolean found = false;
        int count = 0;
        
        while(curr != null){
            if(curr.getElement() == search){
                found = true;
                count ++;
            }
            
            curr = curr.getNext();
        }
        
        if(found){
            System.out.println(search + " is found");
            System.out.println("The number of " + search + "in the data set is " + count);
        }else{
            System.out.println(search + " is not found");
        }
    }
    
    private static void linearSearchRange(LinkedList linkedList, int begin, int end){
        Node curr = linkedList.getHead();
        boolean found = false;
        int count = 0;
        
        while(curr != null){
            if(curr.getElement() >= begin && curr.getElement() <= end){
                found = true;
                count ++;
            }
            
            curr = curr.getNext();
        }
        
        if(found){
            System.out.println("The integer can be found in between "+ begin + " and " + end);
            System.out.println("The number of elements in between " + begin + " and " + end + " is " + count);
        }else{
            System.out.println("No integer can be found in between "+ begin + " and " + end);
        }
    }
}
