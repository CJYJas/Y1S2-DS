/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class MyArray<T>{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Jane", "Tom", "Bob"));
        ArrayList<Character> list3 = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
        
        listAll(list1);
        listAll(list2);
        listAll(list3);
    }
    
    public static <T> void listAll(ArrayList<T> list) {
        for (T t : list) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
