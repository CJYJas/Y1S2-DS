/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class CompareSize<T>{
    public static void main(String[] args) {
        String[] list1 = {"bob", "paul", "sam"};
        Integer[] list2 = {2, 4, 5};
        
        System.out.println("List 1 element greater than Jane : " + countGreater(list1, "jane"));
        System.out.println("List 2 element greater than 3 : " + countGreater(list2, 3));
        
    }
    
    public static <T extends Comparable<T>> int countGreater(T[] array, T threshold){
        int count = 0;
        
        for(T t : array){
            if(t.compareTo(threshold) > 0){
                count ++;
            }
        }
        return count;
    }
}

//<T extends Comparable<T>> is necessary here to let the methods know there this method must have a compareTo() used
//Circle class must also implement class Circle <T extends Comparable<T>> because the method want used is compareTo()

