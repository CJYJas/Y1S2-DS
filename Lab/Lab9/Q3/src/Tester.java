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
        Random rand = new Random();
        SortTest test = new SortTest();
        
        System.out.println("Performance Comparison of Sorting Algorithms");
        System.out.println("Running on 1000 sets of 10000 random numbers");
        
        for(int i = 0; i < 1000; i++){
            int[] testSet = new int[1000];
            for(int j = 0; j < testSet.length; j++){
                testSet[j] = rand.nextInt(10000);
            }
            
            test.quickSort(testSet, 0, testSet.length - 1);
            test.selectionSort(testSet);
            test.mergeSort(testSet);
            test.insertionSort(testSet);
            test.bubbleSort(testSet);
        }
        
        test.getLeaderBoard();
    }
}
