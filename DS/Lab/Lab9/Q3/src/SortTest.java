/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class SortTest {
    private int quickSortCount;
    private int selectionSortCount;
    private int mergeSortCount;
    private int insertionSortCount;
    private int bubbleSortCount;
    
    public SortTest(){
        this.bubbleSortCount = 0;
        this.insertionSortCount = 0;
        this.mergeSortCount = 0;
        this.quickSortCount = 0;
        this.selectionSortCount = 0;
    }
    
    public void quickSort(int[] list, int low, int high){
        if(low < high){
            int partitionIndex = partition(list, low, high);
            
            quickSort(list, 0, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, high);
        }
    }
    
    private int partition(int[] list, int low, int high){
        this.quickSortCount ++;
        int pivot = list[high];
        int i = low - 1;
        
        for(int j = low; j < high; j++){
            if(list[j] <= pivot){
                i++;
                
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        
        i++;
        int temp = list[i];
        list[i] = list[high];
        list[high] = temp;
        
        return i;
    }
    
    public void selectionSort(int[] list){
        for(int i = 0; i < list.length; i++){
            int currentMin = list[i];
            int currentMinIndex = i;
            
            for(int j = i + 1; j < list.length; j++){
                this.selectionSortCount++;
                 
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    
    public void mergeSort(int[] list){
        if(list.length > 1){
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            
            int secondHalfLength = list.length - firstHalf.length;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, firstHalf.length, secondHalf, 0, secondHalfLength);
            
            merge(firstHalf, secondHalf, list);
        }
    }
    
    private void merge(int[] firstHalf, int[] secondHalf, int[] temp){
        this.mergeSortCount ++;
        
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        while(current1 < firstHalf.length && current2 < secondHalf.length){
            if(firstHalf[current1] < secondHalf[current2]){
                temp[current3++] = firstHalf[current1 ++];
            }else{
                temp[current3++] = secondHalf[current2 ++];
            }
        }
        
        while(current1 < firstHalf.length){
            temp[current3++] = firstHalf[current1++];
        }
        
        while(current2 < secondHalf.length){
            temp[current3++] = secondHalf[current2++];
        }
    }
    
    public void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int currElement = list[i];
            int k;
            
            for(k = i - 1; k >= 0 && list[k] > currElement; k--){
                list[k + 1] = list[k];
                this.insertionSortCount ++;
            }
            
            list[k + 1] = currElement;
        }
    }
    
    public void bubbleSort(int[] list){
        boolean needNextPass = true;
        
        for(int i = 1; i < list.length && needNextPass; i++){
            needNextPass = false;
            
            for(int j = 0; j < list.length - i; j++){
                
                if(list[i] > list[i + 1]){
                    this.bubbleSortCount ++;
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
    
    public void getLeaderBoard(){
        ArrayList<SortMethod> results = new ArrayList<>();
        
        results.add(new SortMethod("Bubble Sort", this.bubbleSortCount));
        results.add(new SortMethod("Insertion Sort", this.insertionSortCount));
        results.add(new SortMethod("Merge Sort", this.mergeSortCount));
        results.add(new SortMethod("Selectiom Sort", this.selectionSortCount));
        results.add(new SortMethod("Quick Sort", this.quickSortCount));
        
        results.stream().sorted(Comparator.comparing(r -> r.count)).forEach(r -> System.out.println(r.name + " : " + r.count));
    }
}

class SortMethod{
    String name;
    int count;
    
    public SortMethod(String name, int count){
        this.count = count;
        this.name = name;
    }
}
