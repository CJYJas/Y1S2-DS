/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        
        int[] elements = new int[n];
        for(int i = 0; i < n; i++){
            elements[i] = rand.nextInt(10);
        }
        
        System.out.print("The elements of the array: ");
        for(int i : elements){
            System.out.print(i);
        }
        System.out.println("");
        
        HashSet<String> set = new HashSet<>();
        permutation(elements, 0, set);
        
        for(String num : set){
            System.out.println(num);
        }
    } 
    
    public static void permutation(int[] list, int currIndex, HashSet<String> set){
        if(currIndex == list.length){
            String number = "";
            for(int digit : list){
                number += digit;
            }
            set.add(number);
            return;
        }
        
        for(int i = currIndex; i < list.length; i++){
            swap(list, i, currIndex);
            permutation(list, currIndex + 1, set);
            swap(list, i, currIndex);
        }
    }
    
    public static void swap(int[] list, int i, int currIndex){
        int temp = list[i];
        list[i] = list[currIndex];
        list[currIndex] = temp;
    }
}
