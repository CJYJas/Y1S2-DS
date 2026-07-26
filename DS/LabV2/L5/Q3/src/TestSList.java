/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestSList {
    public static void main(String[] args) {
        SList list = new SList();
        
        System.out.println("adding : 1");
        list.addFirst(1);
        System.out.println("adding : 10");
        list.addLast(10);
        System.out.println("adding : 100");
        list.addLast(100);
        System.out.println("deleted : 100");
        list.removeElement(list.getSize() - 1);
        
        list.addElement(2, 2);
        
        System.out.println("iterating forward ..");
        list.traverseFoward();
        System.out.println("iterating backward ..");
        list.traverseBackward();
        
        int size = list.getSize();
        System.out.println("size of current doubly linked list : " + size);
        
        System.out.println("successfully clear " + size + " node (s)");
        list.clear();
        System.out.println("size of current doubly linked list : " + list.getSize());
    }    
}
