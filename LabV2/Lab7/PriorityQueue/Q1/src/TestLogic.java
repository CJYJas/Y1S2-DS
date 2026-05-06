/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestLogic {
    public static void main(String[] args) {
        PriorityQueueLogic list = new PriorityQueueLogic<>();
        
        int[] elements = {4, 8, 1, 2, 9, 6, 3, 7};
        
        for(int i : elements){
            list.add(i);
        }
        System.out.println("Original list :");
        System.out.println(list.toString());
        
        System.out.println("Elements being pop : " + list.poll());
        System.out.println("Queue size : " + list.size());
        list.add(5);
        System.out.println("Add element 5");
        System.out.println("Queue size : " + list.size());
        System.out.println(list.toString());
        
        Integer[] listArray = (Integer[]) list.toArray(new Integer[0]);
        System.out.println("Element in array");
        for(Integer i : listArray){
            System.out.print(i + ",");
        }
        System.out.println("");
        
       PriorityQueueLogic reversedList = new PriorityQueueLogic<>(true);
       for(int i : elements){
            reversedList.add(i);
        }
        System.out.println("Reversed List : ");
        System.out.println(reversedList.toString());
        
        System.out.println("Element being pop " + list.poll());
        list.add(5);
        
        System.out.println(reversedList.peek());
        
        if(reversedList.contains(1)){
            System.out.println("Queue contains 1");
        }else{
            System.out.println("Queue do not contains 1");
        }
        
        System.out.println("After adding element 5");
        System.out.println(reversedList.toString());
        
        Integer[] listArray2 = (Integer[]) reversedList.toArray(new Integer[0]);
        for(Integer i : listArray2){
            System.out.print(i + ",");
        }
        System.out.println("");
    }  
}


