/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Day{
    private int[] dayList = {1, 2, 3, 4, 5, 6, 7};
    private CircularLinkedList linkList = new CircularLinkedList<>();
    private String today;
    
    public Day(){
        for(int d : dayList){
            linkList.Insert(d);
        }
    }
    
    private String Mapping(int i){
        return switch(i){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Undefined";
        };
    }
    
    public String todayDay(int i){
        today = Mapping(i);
        return today;
    }
    
    public String getDay(int i, int repeat){
        int getDayIndex = (int) linkList.getElement(i, repeat);
        String receivedDay = Mapping(getDayIndex);
        return receivedDay;
    }
}
