/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class MainClass<T>{
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        
        String[] list1 = {"Paul", "Sam", "Ben"};
        String[] list2 = {"Paul", "Eric", "Ben", "John"};
        
        for(String s : list1){
            bag1.add(s);
        }
        
        
        for(String s : list2){
            bag2.add(s);
        }
        
        BagInterface<String> unionBag = bag1.union(bag2);
        Object[] unionResult = unionBag.toArray();
        System.out.print("Union of both bag : ");
        for(Object s : unionResult){
            System.out.print(s + ",");
        }
        System.out.println("");
        
        BagInterface<String> intersectionBag = bag1.intersection(bag2);
        Object[] intersectionResult = intersectionBag.toArray();
        System.out.print("Intersection of both bag : ");
        for(Object s : intersectionResult){
            System.out.print(s+ ",");
        }
        System.out.println("");
        
        BagInterface<String> differenceBag = bag1.difference(bag2);
        Object[] differenceResult = differenceBag.toArray();
        System.out.print("Difference of both bag : ");
        for(Object s : differenceResult){
            System.out.print(s + ",");
        }
        System.out.println("");
        
        if(bag1.isSubsetOf(bag2)){
            System.out.println("Bag 1 is subset of bag 2");
        }else{
            System.out.println("Bag 1 is not a subset of bag 2");
        }
    }   
}
