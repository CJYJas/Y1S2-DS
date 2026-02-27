/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q4;

/**
 *
 * @author User
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Q4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedTodayDate = today.format(myFormat);
        
        DayOfWeek dayName = today.getDayOfWeek();
        
        System.out.println("Today Date (dd/mm/yyy): " + formattedTodayDate);
        System.out.println("Today is on " + dayName);
        
        System.out.println("Search Date (dd/mm/yyyy) : 20/8/2015");
        LocalDate targetDate = LocalDate.of(2015, 8, 20);
        
        int diffDay = calDay(today, targetDate);
        int todayIndex = today.getDayOfWeek().getValue() % 7;
        int targetIndex = (todayIndex + diffDay) % 7;
        if(targetIndex < 0) targetIndex += 7;
        String targetDay = "";
        
        switch(targetIndex){
            case(0) -> targetDay = "Sunday";
            case(1) -> targetDay = "Monday";
            case(2) -> targetDay = "Tuesday";
            case(3) -> targetDay = "Wednesday";
            case(4) -> targetDay = "Thursday";
            case(5) -> targetDay = "Friday";
            case(6) -> targetDay = "Saturday";
        }
        
        System.out.println("Search date is on " + targetDay);
    }
    
    public static int calDay(LocalDate currDate, LocalDate targetDate){
        int diffDay;
        
        if(currDate.equals(targetDate)){
            return 0;
        }else if(currDate.isBefore(targetDate)){
            diffDay = 1 + calDay(currDate.plusDays(1), targetDate);
            return diffDay;
        }else{
            diffDay = -1 + calDay(currDate.minusDays(1), targetDate);
            return diffDay;
        }
    }   
}