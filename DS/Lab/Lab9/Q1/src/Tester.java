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
        
        System.out.print("Enter N Special Random Number within 0 -100 :");
        int n = input.nextInt();
        int[] list = {34, 32, 40, 92, 95, 79, 73, 65, 92, 54};
        
        for(int i = 0; i < n; i++){
            list[i] = rand.nextInt(101);
        }
           System.out.println("");
        
        System.out.print("The Special Number are :");
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        mergeSort(list);
        System.out.print("After Merge Sort :");
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    private static void mergeSort(int[] list){
        if(list.length > 1){
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            
            mergeSort(firstHalf);
            
            int secondHalfLength = list.length - (list.length / 2);
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            
            merge(firstHalf, secondHalf, list);
        }
    }
    
    private static void merge(int[] firstHalf, int[] secondHalf, int[] temp){
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        while(current1 < firstHalf.length && current2 < secondHalf.length){
            boolean firstHalfEven = firstHalf[current1] % 2 == 0;
            boolean secondHalfEven = secondHalf[current2] % 2 == 0;
            
            if(firstHalfEven != secondHalfEven){
                if(firstHalfEven){
                    temp[current3++] = secondHalf[current2++];
                }else{
                    temp[current3++] = firstHalf[current1++];
                }
                
                continue;
            }
            
            if(firstHalf[current1] < secondHalf[current2]){
                temp[current3++] = firstHalf[current1++];
            }else{
                temp[current3++] = secondHalf[current2++];
            }
        }
        
        while(current1 < firstHalf.length){
            temp[current3++] = firstHalf[current1 ++];
        }
        
        while(current2 < secondHalf.length){
            temp[current3++] = secondHalf[current2 ++];
        }
    }
}


////list = 34 32 33
//firstHalf = 34 32 33 -> hang
//
//firstHalf = 34 32 -> hang
//secondHalf = 33
//merge({32, 34}, 33, list)
//
//firstHalf = 34
//secondHalf = 32
//merge(34, 32, list) -> t t -> temp[0] = 32, temp[1] = 34 -> list = 32 34 33 -> back