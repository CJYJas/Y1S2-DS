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
        System.out.print("Enter a String parameter : ");
        String parameter = input.nextLine();
        
        char[] parameterChar = parameter.toCharArray();
        String substituteResult = SubstituteAI(parameterChar, 0);
        
        System.out.println("String after substitute : " + substituteResult);
    }
    
    private static String SubstituteAI(char[] parameter, int index){
        if(index >= parameter.length){
            String result = new String(parameter);
            return result;
        }
        
        if(parameter[index] == 'a'){
            parameter[index] = 'i';
        }
        
        
        return SubstituteAI(parameter, index + 1);
    }
}
