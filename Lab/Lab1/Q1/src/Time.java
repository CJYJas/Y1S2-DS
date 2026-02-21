/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

class Time {
    private int hour;
    private int min;
    
    public Time(int hour, int min){
        this.hour = hour;
        this.min = min;
    }
    
    public boolean checkValidality(){
        if(hour < 0 || hour > 23){
            return false;
        }
        
        return !(min < 0 || min > 59);
    }
    
    public void display(){
        System.out.print("Hour: " + hour + " Minute:" + min + " ");
        if(checkValidality()){
            if(hour > 12){
                hour = hour - 12;
                System.out.println(" " + hour + ":" + min + "PM");
            }else{
                System.out.println(" " + hour + ":" + min + "AM");
            }
        }else{
            System.out.println(" Invalid time input");
        }
    }
}

class Tester{
    public static void main(String[] args){
        Time t1 = new Time(13, 45);
        t1.display();
        Time t2 = new Time(33, 15);
        t2.display();
        Time t3 = new Time(10, 52);
        t3.display();       
    }
}
