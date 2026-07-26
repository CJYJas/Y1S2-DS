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
        String[] fruitQ = {"Durian", "Blueberry"};
        MyQueue list = new MyQueue(fruitQ);
        
        String[] addItem = {"Apple", "Orange", "Grapes", "Cherry"};
        for(String i : addItem){
            list.enqueue(i);
        }
        
        System.out.println(list.toString());
        System.out.println("Top item : " + list.peek());
        System.out.println("List size : " + list.getSize());
        System.out.println("Delete Durian");
        list.dequeue();
        
        if(list.contains("Cherry")){
            System.out.println("List contain cherry");
        }else{
            System.out.println("List do not contain cherry");
        }
        
        if(list.contains("Durian")){
            System.out.println("List contain durian");
        }else{
            System.out.println("List do not contain durian");
        }
        
        while(!list.isEmpty()){
            System.out.print(list.dequeue() + ",");
        }
        System.out.println("");
    }  
}
