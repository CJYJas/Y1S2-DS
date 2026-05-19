/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class DayCycleList {
    private DayNode head;
    private DayNode tail;
    
    public DayCycleList(){
        this.head = null;
        this.tail = null;
    }
    
    public void setCycleList(String day){
        DayNode newDay = new DayNode(day);
        if(head == null){
            head = newDay;
            tail = newDay;
            tail.setNext(head);
            return;
        }
        
        tail.setNext(newDay);
        tail = newDay;
        newDay.setNext(head);
    }
    
    public DayNode getHead(){
        return head;
    }
}
