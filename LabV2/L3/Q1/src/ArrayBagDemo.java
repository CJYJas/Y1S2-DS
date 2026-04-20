/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class ArrayBagDemo<T>{
    private static <T> void testAdd(BagInterface<T> aBag, T[] content){
        for(T s : content){
            aBag.add(s);
        }
    }   
    
    private static <T> void displayBag(BagInterface<T> aBag){
        System.out.println("The bags contains " + aBag.getCurrentSize() + " string(s) as follows : ");
        Object[] list = aBag.toArray();
        
        for(Object s : list){
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag();
        ArrayBag<String> bag2 = new ArrayBag();
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        testAdd(bag1, contentsOfBag1);
        testAdd(bag2, contentsOfBag2);
        
        System.out.println("bag1");
        System.out.println("Adding A A B A C A");
        displayBag(bag1);
        System.out.println("bag2");
        System.out.println("Adding A B A C B C D another string");
        displayBag(bag2);
        
        BagInterface<String> diffItems = bag1.difference(bag2); 
        System.out.println("bag3, test the method difference of bag1 and bag2");
        displayBag(diffItems);
        
        BagInterface<String> unionItems = bag1.union(bag2); 
        System.out.println("bag4, test the method union of bag1 and bag2");
        displayBag(unionItems);
        
        BagInterface<String> intersectionItems = bag1.union(bag2); 
        System.out.println("bag5, test the method intersection of bag1 and bag2");
        displayBag(intersectionItems);
    }
}
