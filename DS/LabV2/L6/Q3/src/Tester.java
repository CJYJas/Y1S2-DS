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
        MyStack<Character> list = new MyStack<>();
        
        String word;
        int wordCount;
        do{
             System.out.print("Enter tested word (word length <= 15): ");
             word = input.nextLine().toLowerCase();
             
             wordCount = word.length();
             if(wordCount > 15){
                 System.out.println("Too long word");
             }
        }while(wordCount > 15);
        
        char[] splitWord = word.toCharArray();
        for(char c : splitWord){
            list.push(c);
        }
        
        String reversedWord = "";
        while(!list.isEmpty()){
            char val = list.pop();
            reversedWord += val;
        }
        
        if(word.equals(reversedWord)){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }    
}
