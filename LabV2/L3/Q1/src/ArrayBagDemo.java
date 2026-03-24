/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ArrayBagDemo {
    private static void testAdd(BagInterface<String> aBag, String[] content){
        for(String s : content){
            aBag.add(s);
        }
    }   
    
    private static void displayBag(BagInterface<String> aBag){
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
        
        Object[] unionObjects = bag1.union(bag2);
        String[] unionItems = new String[unionObjects.length];
        for (int i = 0; i < unionObjects.length; i++) {
            unionItems[i] = (String) unionObjects[i];
        }
        ArrayBag bag3 = new ArrayBag();
        testAdd(bag3, unionItems);
        System.out.println("bag3, test the method union of bag1 and bag2");
        displayBag(bag3);
        
        Object[] commonObjects = bag1.intersection(bag2);
        String[] commonItems = new String[commonObjects.length];
        for (int i = 0; i < commonObjects.length; i++) {
            commonItems[i] = (String) commonObjects[i];
        }
        ArrayBag bag4 = new ArrayBag();
        testAdd(bag4, commonItems);
        System.out.println("bag4, test the method intersection of bag1 and bag2");
        displayBag(bag4);
        
        Object[] diffObjects = bag1.difference(bag2);
        String[] differenceItems = new String[diffObjects.length];
        for (int i = 0; i < diffObjects.length; i++) {
            differenceItems[i] = (String) diffObjects[i];
        }
        ArrayBag bag5 = new ArrayBag();
        testAdd(bag5, differenceItems);
        System.out.println("bag5, test the method difference of bag1 and bag2");
        displayBag(bag5);
    }
}
