/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac2;

/**
 *
 * @author User
 */
import java.util.*;
public class Prac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter size of array : ");
        int n = input.nextInt();
        System.out.print("Enter size of subsets : ");
        int k = input.nextInt();
        
        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            list[i] = rand.nextInt(20) + 1;
        }
        
        for(int digit : list){
            System.out.print(digit + " ");
        }
        System.out.println("");
        
        ArrayList<Integer> subset = new ArrayList<>();
        possibleCombination(k, list, 0, subset);
    }
    
    public static void possibleCombination(int k, int[] list, int currIndex, ArrayList<Integer> subset){
        if(subset.size() == k){
            for(int digit : subset){
                System.out.print(digit + " ");                
            }
            System.out.println("");
             return;
        }
        
        if(currIndex == list.length){
            return;
        }
        
        for(int i = currIndex; i < list.length; i++){
            subset.add(list[i]);
            possibleCombination(k, list, i + 1, subset);
            subset.remove(subset.size() - 1);
        }
    }
}




