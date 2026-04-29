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
        
        System.out.print("Enter string to test :");
        String testWord = input.nextLine();
        
        if(checkPalindrome(testWord)){
            System.out.println(testWord + " is a palindrome");
        }else{
            System.out.println(testWord + " is not a palindrome");
        }
    }
    
    public static boolean checkPalindrome(String testWord){
        Stack<Character> stack = new Stack<>();
        MyQueue<Character> queue = new MyQueue<>();
        
        for(Character c : testWord.toCharArray()){
            stack.push(c);
            queue.enqueue(c);
        }
        
        while(!queue.isEmpty()){
            if(!queue.dequeue().equals(stack.pop())){
                return false;
            }
        }
        return true;
    }
}
