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
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Scanner input = new Scanner(System.in);
        
        Encoding encoding = new Encoding(alphabet);
        System.out.println("Queue : " + encoding.getQueue().toString());
        System.out.println("Index : " + encoding.showIndex());
        
        System.out.println("How many times will you enter a number");
        int repeat = input.nextInt();
        int[] enteredNumber = new int[repeat];
        
        System.out.println("(Please enter your number(s) between 0-25");
        for(int i = 0; i < repeat; i++){
            System.out.print("Enter number " + (i + 1));
            enteredNumber[i] = input.nextInt();
        }
        System.out.println("");
        
        System.out.println("The entered numbers are " + Arrays.toString(enteredNumber));
        
        StringBuilder sb = new StringBuilder();
        for(int i : enteredNumber){
            sb.append(encoding.getCharacter(i));
        }
        System.out.println("The deciphered values are " + sb.toString());
    }
}
