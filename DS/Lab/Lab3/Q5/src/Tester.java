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
        int[] list = new int[5];
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        while(true){
            try{
               System.out.print("Enter an Integer:");
               int n = input.nextInt();
               list[count] = n;
               count ++;
            }catch(InputMismatchException e){
                System.out.println("Invalid input type");
                input.nextLine();
            }catch(ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        System.out.println("The array of integer is:");
        for(int j : list){
            System.out.print(j + " ");
        }
        System.out.println("");
    }
}
