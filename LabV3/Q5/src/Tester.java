/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tester {
    public static void main(String[] args) {
        Integer[] list1 = {1,2,3};
        String[] list2 = {"red", "green", "blue"};
        
        Circle radius1 = new Circle(3);
        Circle radius2 = new Circle(2.9);
        Circle radius3 = new Circle(5.9);
        
        Circle[] list3 = {radius1, radius2, radius3};
        
        FindMax intArray = new FindMax(list1);
        FindMax strArray = new FindMax(list2);
        FindMax circleArray = new FindMax(list3);
        
        intArray.display();
        strArray.display();
        circleArray.display();
    }
}
