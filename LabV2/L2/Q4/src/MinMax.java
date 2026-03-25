/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class MinMax<T extends Comparable<T>>{
    private ArrayList<T> list;
    private T min;
    private T max;
    
    public MinMax(ArrayList<T> list){
        this.list = list;
    }

    public void compareTo() {
        min = list.get(0);
        max = list.get(0);
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
            
            if(list.get(i).compareTo(min) < 0){
                min = list.get(i);
            }
        }
    }
    
    public void display(){
        compareTo();
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
    
}
