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
        System.out.print("Input String : ");
        String parameter = input.nextLine();
        
        char[] parameterList = parameter.toCharArray();
        generatePermutation(parameterList, 0);
    }
    
    private static void generatePermutation(char[] parameterList, int start){
        if(start == parameterList.length){
            System.out.println(new String(parameterList));
            return;
        }
        
        for(int i = start; i < parameterList.length; i++){
            swap(parameterList, start, i);
            generatePermutation(parameterList, start + 1);
            swap(parameterList, start, i);
        }
    }
    
    private static void swap(char[] parameterList, int start, int i){
        char temp = parameterList[start];
        parameterList[start] = parameterList[i];
        parameterList[i] = temp;
    }
}

/**
 * 1. generatePermutation(ABC, 0)
 *    i = 0 swap(ABC, 0 , 0) -> no change
 *    generatePermutation(ABC, 1) -> hang
 * 
 * 2. generatePermutation(ABC, 1) -> i = 1 swap(ABC, 1 , 1) -> no change
 *    generatePermutation(ABC, 2) -> hang
 * 
 * 3. generatePermutation(ABC, 2) -> print ABC -> back to generatePermutation(ABC, 1)
 * 
 * 4. swap(ABC, 1, 1) -> no change -> i = 2 -> swap(ABC, 1, 2) -> generatePermutation(ACB, 2) -> hang
 * 
 * 5. generatePermutation(ACB, 2) -> print ACB -> back to generatePermutation(ABC, 1) -> swap back to ABC
 * 
 * 6. back to generatePermutation(ABC, 0) -> i = 1 -> swap to BAC ...
 */
