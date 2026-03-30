/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestLinkedList {
    public static void main(String[] args) {
        char[] list = {'a', 'b', 'c', 'd', 'e'};
        MyLinkedList linkedList = new MyLinkedList();
        
        for(char l : list){
            linkedList.add(l);
        }
        
        System.out.println("Element in Linked List");
        linkedList.print();
        System.out.println("Reversed Element in Linked List");
        linkedList.reverse();
        
        System.out.println("");
        int size = linkedList.size;
        System.out.println("Size of linked list : " + size);
        
        System.out.println("");
        System.out.println("First value in linked list : " + linkedList.getFirst());
        System.out.println("Last value in linked list : " + linkedList.getLast());
        
        System.out.println("");
        System.out.println("Middle value of Linked List : " + linkedList.getMiddleValue());
        linkedList.removeMiddleValue();
        
        System.out.println("");
        System.out.println("Index location of b : " + linkedList.indexOf('b'));
        System.out.println("Index location of c : " + linkedList.indexOf('c'));
        
        System.out.println("");
        if(linkedList.contains('c')){
            System.out.println("Linked List contains 'c'");
        }else{
            System.out.println("Linked List do not contains 'c'");
        }
        
        System.out.println("");
        char[] replaceList = {'h', 'e', 'l', 'l', 'o'};
        for(int i = 0; i < size; i++){
            linkedList.set(i, replaceList[i]);
        }
        System.out.println("Replaced Linked List");
        linkedList.print();
    }  
}
