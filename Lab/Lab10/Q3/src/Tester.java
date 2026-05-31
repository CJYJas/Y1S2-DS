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
        ArrayHash<String, String> hashTable = new ArrayHash<>();
        Scanner input = new Scanner(System.in);
        
        hashTable.put("100-101", "ICND 1");
        hashTable.put("200-101", "ICND 2");
        hashTable.put("200-120", "CCNA Routing and Switching");
        hashTable.put("210-260", "CCNA Security");
        
        System.out.println("The number of course is " + hashTable.getSize());
        hashTable.showHashTable();
        
        System.out.println("Adding a new course");
        hashTable.put("300-101", "Route");
        System.out.println("The number of course is " + hashTable.getSize());
        hashTable.showHashTable();
        
        System.out.println("Modifying 210-260");
        if(hashTable.containsKey("210-260")){
            hashTable.put("210-260", "CCNA RS Security");
        }
        System.out.println("The number of course is " + hashTable.getSize());
        hashTable.showHashTable();
        
        System.out.println("Remove the course 200-101");
        hashTable.remove("200-101");
        System.out.println("The number of course is " + hashTable.getSize());
        hashTable.showHashTable();
        
        System.out.print("Enter a course code to search : ");
        String search = input.nextLine();
        if(hashTable.containsKey(search)){
            System.out.println("Course " + search + " : " + hashTable.getVal(search));
        }
    }
}
