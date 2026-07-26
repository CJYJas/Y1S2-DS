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
        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(5,3,7,1,4,9,8,2));
        ArrayList<String> list2 = new ArrayList(Arrays.asList("red", "blue", "orange", "tan"));
        
        MinMax intArray = new MinMax(list1);
        MinMax strArray = new MinMax(list2);
        
        intArray.display();
        strArray.display();
    }
    
}
