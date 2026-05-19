/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = input.nextInt();
        
        Random rand = new Random();
        int[] elements = new int[n];
        for(int i = 0; i < n; i++){
            elements[i] = rand.nextInt(10);
        }
        
        System.out.print("The elements of the array : ");
        for(int j : elements){
            System.out.print(j);
        }
        System.out.println("");
        Permutation(elements, 0);
    }
    
    private static void Permutation(int[] elements, int index){
        if(index == elements.length){
            for(int j : elements){
                System.out.print(j);
            }
            System.out.println("");
            return;
        }
        
        for(int i = index; i < elements.length; i++){
            swap(elements, index, i);
            Permutation(elements, index + 1);
            swap(elements, i, index);
        }
    }
    
    private static void swap(int[] elements, int i, int j){
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}
