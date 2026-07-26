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
        int[] arr = {10, 34, 2, 56, 7, 67, 88, 42};
        System.out.println("Before Insertion Sort : ");
        for(int i : arr){
            System.out.print(i + " ,");
        }
        System.out.println("");
        
        InsertionSort(arr);
        System.out.println("After Insertion Sort : ");
        for(int i : arr){
            System.out.print(i + ", ");
        }
        System.out.println("");
    }
    
    public static void InsertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int currElement = arr[i];
            int k;
            
            for(k = i - 1; k >= 0 && arr[k] > currElement; k--){
                arr[k + 1] = arr[k];
            }
            
            arr[k + 1] = currElement;
        }
    }
}

//{10, 34, 2, 56, 7, 67, 88, 42}
//currElement = 10
//k = -1 -> pass -> arr[0] = 10
//
//currElement = 34
//k = 0 -> pass -> arr[1] = 34
//
//currElement = 2
//k = 1 -> enter loop -> arr[2] = 34
//k = 0 -> enter loop -> arr[1] = 10
//arr[-1 + 1 = 0] = 2
