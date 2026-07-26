/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Find second largest element in array
 */

public class findElement{
    public static void main(String[] args) {
        Integer[] nums = {10,5,20,20,15};
        
        System.out.println("Second largest element : " + findSecondMax(nums));
    }
    
    public static <E extends Comparable<E>> E findSecondMax(E[] list){
        if(list.length < 2){
            return null;
        }
        
        E max = list[0];
        E secondMax = list[1];
        
        for(E num : list){
            if(num.compareTo(secondMax) < 0){
                continue;
            }
            
            if(num.compareTo(max) >= 0){
                max = num;
                continue;
            }
            
            if((num.compareTo(secondMax) > 0) && (num.compareTo(max) < 0)){
                secondMax = num;
            }
        }
        
        return secondMax;
    }
}
