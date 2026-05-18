/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tester {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] list = {1, 2, 3, 4, 5, 6};
        
        for(int i : list){
            linkedList.addLast(i);
        }
        
        linkedList.printList();
        linkedList.zipMerge();
        linkedList.printList();
    }    
}
