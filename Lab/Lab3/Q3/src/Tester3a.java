/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester3a {
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
        
        permutation(elements, 0);
    }
    
    public static void permutation(int[] list, int currentIndex){
        if(currentIndex == list.length){
            for(int digit : list){
                System.out.print(digit);
            }
            System.out.println(""); 
            return;
        }
        
        for(int i = currentIndex; i < list.length; i++){
            swap(list, i, currentIndex);
            permutation(list, currentIndex + 1);
            swap(list, i, currentIndex);
        }
    }
    
    public static int[] swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        
        return list;
    }
}
