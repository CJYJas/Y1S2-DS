/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class TestSList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SList list = new SList();
        String name;
        
        System.out.println("Enter your student name list.Enter 'n' to end");
        do{
            name = input.nextLine();
            if(!"n".equals(name)){
                list.add(name);
            }
        }while(!"n".equals(name));
        
        System.out.println("You have entered the following students' name : ");
        list.printList();
        
        System.out.println("The number of students entered is : " + list.getSize());
        
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String choice1 = input.nextLine();
        
        if(choice1.equals("r")){
            System.out.println("Enter the existing student name that you want to rename : ");
            String oldName = input.nextLine();
            System.out.println("Enter the new name : ");
            String newName = input.nextLine();
            list.replace(oldName, newName);
            
            System.out.println("The new student list is : ");
            list.printList();
        }
        
        System.out.println("Do you want to remoce any of your student name? Enter 'y' for yes, 'n' to proceed.");
        String choice2 = input.nextLine();
        
        if(choice2.equals("y")){
            System.out.println("Enter a student name to remove : ");
            String removedName = input.nextLine();
            list.removeElement(removedName);
            
            System.out.println("The number of updated student is : " + list.getSize());
            System.out.println("The updated list is : ");
            list.printList();
        }
        
        System.out.println("All student data captured complete.Thank you.");
    }   
}
