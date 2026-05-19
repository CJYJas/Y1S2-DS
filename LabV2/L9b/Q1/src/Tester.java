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
        System.out.println("F(4, 10) : " + Recursion(4, 10));
        System.out.println("F(12, 8) : " + Recursion(12, 8));
        System.out.println("F(7, 12) : " + Recursion(7, 12));
    }
    
    private static long Recursion(int x, int y){
        if(x == 0 || y == 0){
            return 1;
        }
        
        return Recursion(x - 1, y) + Recursion(x, y - 1);
    }
}
