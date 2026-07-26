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
        Scanner input = new Scanner(System.in);
        Day day = new Day();
        
        System.out.println("Specify your day in number:");
        System.out.println("1 for Monday");
        System.out.println("2 for Tuesday");
        System.out.println("3 for Wednesday");
        System.out.println("4 for Thursday");
        System.out.println("5 for Friday");
        System.out.println("6 for Saturday");
        System.out.println("7 for Sunday");
        
        int index = input.nextInt();
        
        String today = day.todayDay(index);
        System.out.println("The name of the day is : " + today);
        String tmr = day.getDay(index, 1);
        System.out.println("The following day of " + today + " is : " + tmr);
        String ytd = day.getDay(index, -1);
        System.out.println("The previous day of " + today + " is : " + ytd);
        
        System.out.println("How many days to add to the specified/current day " + today + "? : ");
        int repeat = input.nextInt();
        String followingDay = day.getDay(index, repeat);
        System.out.println("The new day after the addition of " + repeat + " day(s) is : " + followingDay);
    }
}
