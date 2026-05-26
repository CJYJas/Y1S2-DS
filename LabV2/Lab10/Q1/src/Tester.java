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
        int[] arr = {45, 7, 2, 8, 19, 3};
        
        selectionSortSmallest(arr);
        System.out.print("After smallest selection sort : ");
        for(int i : arr){
            System.out.print(i + " ,");
        }
        System.out.println("");
        selectionSortLargest(arr);
        System.out.print("After largest selection sort : ");
        for(int i : arr){
            System.out.print(i + " ,");
        }
        System.out.println("");
    }
    
    public static void selectionSortSmallest(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int currentMinIndex = i;
            int currentMin = arr[i];
            
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < currentMin){
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            
            if(currentMinIndex != i){
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
    
    public static void selectionSortLargest(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int currentMaxIndex = i;
            int currentMax = arr[i];
            
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > currentMax){
                    currentMax = arr[j];
                    currentMaxIndex = j;
                }
            }
            
            if(currentMaxIndex != i){
                arr[currentMaxIndex] = arr[i];
                arr[i] = currentMax;
            }
        }
    }
}
