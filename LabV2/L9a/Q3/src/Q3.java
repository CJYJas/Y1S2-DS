/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter y : ");
        int y = input.nextInt();
        
        System.out.println("Exponent of 10 to 3 : " + Exponent(x, y));
    }

    public static long Exponent(int x, int m){  
        if(m == 0){
            return 1;
        }
        
        return  Exponent(x, m - 1) * x;
    }
}



