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
        MyStack<Integer> S = new MyStack<>();
        
        System.out.println("Enter number to add (-1 to stop adding) :");
        int val;
        do{
            val = input.nextInt();
            if(val != -1){
                S.push(val);
            }
        }while(val != -1);
        
        System.out.println("The element in stack : " + S.toString());
        System.out.println("Sum of element in stack : " + sumOfStack(S));
    } 
    
    public static int sumOfStack(MyStack<Integer> list){
        int sum = 0;
        
        while(!list.isEmpty()){
            int val = list.pop();
            sum += val;
        }
        
        return sum;
    }
}
