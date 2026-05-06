/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class MainLogic {
    public static void main(String[] args) {
        PriorityQueue<String> list1 = new PriorityQueue<>();
        PriorityQueue<String> list2 = new PriorityQueue<>();
        
        String[] nameList1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] nameList2 = {"George", "Katie", "Kevin", "Michael", "Ryan"};
        
        list1.addAll(Arrays.asList(nameList1));
        list2.addAll(Arrays.asList(nameList2));
        
        System.out.println("Name list for List 1");
        System.out.println(list1.toString());
        System.out.println("Name list for List 2");
        System.out.println(list2.toString());
        
        Operation ops = new Operation(list1, list2);
        System.out.println("Union result");
        System.out.println(ops.Union());
        System.out.println("Intersection result");
        System.out.println(ops.Intersection());
        System.out.println("Difference result");
        System.out.println(ops.Difference(1));
        System.out.println("Difference result");
        System.out.println(ops.Difference(2));
    }  
}
