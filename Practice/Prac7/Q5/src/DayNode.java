/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class DayNode{
    private String day;
    private DayNode next;
    
    public DayNode(String day){
        this.day = day;
        this.next = null;
    }
    
    public String getDay(){
        return this.day;
    }
    
    public DayNode getNext(){
        return this.next;
    }
    
    public void setDay(String day){
        this.day = day;
    }
    
    public void setNext(DayNode next){
        this.next = next;
    }
}
