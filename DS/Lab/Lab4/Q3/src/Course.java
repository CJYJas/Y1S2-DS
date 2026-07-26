/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Course {
    public static void main(String[] args) {
        String[] courseCode = {"WXX101", "WXX201", "WXX301"};
        String[] courseName = {"Programming", "Networking", "Operating System"};
        String[] creditHour = {"5", "4", "3"};
        String[] grade = {"B", "C", "A"};
        System.out.println("The list consist of");
        
        LinkedList list = new LinkedList();
        
        for(int i = 0; i < 3; i++){
            list.originalList(courseCode[i]);
            list.originalList(courseName[i]);
            list.originalList(creditHour[i]);
            list.originalList(grade[i]);
        }
        
        list.display();
        
        int totalPoint = list.totalPoint();
        int totalCreditHour = list.totalCreditHour();
        double avg = (double) totalPoint / totalCreditHour;
        
        System.out.println("Total point is " + totalPoint);
        System.out.println("Total credit is " + totalCreditHour);
        System.out.println("Grade point average is " + avg);
    }
}

