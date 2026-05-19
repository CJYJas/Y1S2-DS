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
        System.out.print("Enter n : ");
        int n = input.nextInt();
        
        System.out.print("(x + y)^3 = ");
        for(int k = 0; k <= n; k++){
            long coefficient = Recursion(n - k, k);
            if(n == k){
                System.out.print(coefficient + "x^" + (n-k) + "y^" + k);
                continue;
            }
            System.out.print(coefficient + "x^" + (n-k) + "y^" + k + " + ");
        }
        System.out.println("");
    }
    
    private static long Recursion(int n, int k){
        if(n == 0 || k == 0){
            return 1;
        }
        
        return Recursion(n - 1, k) + Recursion(n, k - 1);
    }
}