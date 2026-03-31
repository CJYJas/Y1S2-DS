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
        CandyMachine machine = new CandyMachine();
        
        machine.showSelection();
        int choice = 0;
        do{
            System.out.print("Enter selection : ");
            choice = input.nextInt();
            machine.sellProduct(choice);
        }while(choice != 0);
    }   
}
