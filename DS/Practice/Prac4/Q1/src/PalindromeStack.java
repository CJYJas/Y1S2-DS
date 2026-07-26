/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class PalindromeStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wordCount;
        String word;
        
        do{
            System.out.println("Enter a word: ");
            word = input.nextLine();
            wordCount = word.length();
        }while(wordCount > 15);
        
        char[] wordList = word.toCharArray();
        
        if(PalindromeCheck(wordList)){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Its not a palindrome");
        }
    }
    
    public static boolean PalindromeCheck(char[] wordList){
        MyStack<Character> stack = new MyStack<>();

        // Push everything onto the stack
        for (char c : wordList) {
            stack.push(c);
        }

        // Compare the array (forward) to the stack pops (backward)
        for (char c : wordList) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
