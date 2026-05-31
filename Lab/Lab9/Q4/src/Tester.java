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
        Random rand = new Random();
        HeapSort sort = new HeapSort();
        
        System.out.print("Enter N characters: ");
        int n = input.nextInt();
        
        char[] list = new char[n];
        for(int i = 0; i < n; i++){
            list[i] = (char) rand.ints(65, 91).findFirst().getAsInt();
        }
        
        System.out.print("The characters are : ");
        for(char c : list){
            System.out.print(c + " ");
        }
        System.out.println("");
        
        System.out.println("Heap Sort - Ascending Order");
        sort.heapSort(list);
        for(char c : list){
            System.out.print(c + " ");
        }
        System.out.println("");
    }
}
