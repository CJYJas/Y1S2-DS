/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        DayCycleList dayList = new DayCycleList();
        String[] day = {"sunday", "saturday", "friday", "thursday", "wednesday", "tuesday", "monday"};
        for(String d : day){
            dayList.setCycleList(d);
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Today Date (dd/mm/yyyy) : ");
        int todayDd = input.nextInt();
        int todayMonth = input.nextInt();
        int todayYear = input.nextInt();
        
        input.nextLine();
        
        System.out.print("Today is : ");
        String todayDay = input.nextLine();
        DayNode todayNode = findTodayNode(todayDay, dayList);
        
        System.out.print("Search Date (dd/mm/yyyy) : ");
        int searchDd = input.nextInt();
        int searchMonth = input.nextInt();
        int searchYear = input.nextInt();
        
        input.nextLine();
        
        searchDay(todayDd, todayMonth, todayYear, todayNode, searchDd, searchMonth, searchYear, dayList);
    }
    
    private static DayNode findTodayNode(String todayDay, DayCycleList dayList){
        DayNode temp = dayList.getHead();
        while(!todayDay.toLowerCase().equals(temp.getDay())){
            temp = temp.getNext();
        }
        
        return temp;
    }
    
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 ->  {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                }else {
                    return 28;
                }
            }
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
    
    private static void searchDay(int todayDd, int todayMonth, int todayYear, DayNode todayNode, int searchDd, int searchMonth, int searchYear, DayCycleList dayList){
        if(todayDd == searchDd && todayMonth == searchMonth && todayYear == searchYear){
            System.out.println("Search Date is on " + todayNode.getDay());
            return;
        }
        
        todayNode = todayNode.getNext();
        todayDd -= 1;
        
        if(todayDd == 0){
            todayMonth -= 1;
            
            if(todayMonth == 0){
                todayYear -= 1;
                todayMonth = 12;
            }
            
            todayDd = getDaysInMonth(todayMonth, todayYear);
        }
        
        
        searchDay(todayDd, todayMonth, todayYear, todayNode, searchDd, searchMonth, searchYear, dayList);
    }
}
