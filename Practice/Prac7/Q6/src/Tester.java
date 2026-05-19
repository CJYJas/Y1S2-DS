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
        int[] array = new int[5];
        
        ReceivedCorrectInput(array, 0, input);
    }
    
    private static void ReceivedCorrectInput(int[] array, int index, Scanner input){
        if(index == array.length){
            System.out.println("The array of integeres are :");
            for(int i : array){
                System.out.print(i + " ");
            }
            System.out.println("");
            return;
        }
        
        System.out.print("Enter an Integer :");
        try{
            int element = input.nextInt();
            array[index] = element;
            ReceivedCorrectInput(array, index + 1, input);
        }catch(InputMismatchException e){
            System.out.println("Invalid input type");
            input.nextLine();
            ReceivedCorrectInput(array, index, input);
        }
    }
}

