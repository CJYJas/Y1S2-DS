/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class HeapSort {
    public void heapSort(char[] list){
        int n = list.length;
        
        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(list, n, i);
        }
        
        for(int i = n - 1; i > 0; i--){
            char temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            
            heapify(list, i , 0);
        }
    }
    
    private void heapify(char[] list, int size, int i){
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        
        if(leftChild < size){
            if(list[leftChild] > list[largest]){
                largest = leftChild;
            }
        }
        
        if(rightChild < size){
            if(list[rightChild] > list[largest]){
                largest = rightChild;
            }
        }
        
        if(largest != i){
            char temp = list[i];
            list[i] = list[largest];
            list[largest] = temp;
            
            heapify(list, size, largest);
        }
    }
}
