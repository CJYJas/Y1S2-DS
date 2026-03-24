/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
class MinMaxTwoDArray<E extends Comparable<E>>{
    private E[][] list;
    
    public MinMaxTwoDArray(E[][] list){
        this.list = list;
    }
    
    public static <E extends Comparable<E>> E findMin(E[][] list){
        E min = list[0][0];
        
        for (E[] list1 : list) {
                for (E list11 : list1) {
                    if (list11.compareTo(min) < 0) {
                        min = list11;
                    }
                }
        }
        
        return min;
    }
    
    public static <E extends Comparable<E>> E findMax(E[][] list){
        E max = list[0][0];
        
        for (E[] list1 : list) {
                for (E list11 : list1) {
                    if (list11.compareTo(max) > 0) {
                        max = list11;
                    }
                }
        }
        
        return max;
    }
    
    public void display(){
        System.out.println("Min : " + findMin(list));
        System.out.println("Max : " + findMax(list));
    }   
}
