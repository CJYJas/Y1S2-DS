/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class FindMax<T extends Comparable<T>>{
    private T[] list;
    private T min;
    private T max;
    
    public FindMax(T[] list){
        this.list = list;
    }

    public void findMax() {
        max = list[0];
        
        for (T list1 : list) {
            if (list1.compareTo(max) > 0) {
                max = list1;
            }
        }
    }
    
    public void display(){
        findMax();
        System.out.println("Max : " + max);
    }
    
}
