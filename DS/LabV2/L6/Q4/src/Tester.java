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
        
        MyStack<Integer> rod1 = new MyStack<>();
        MyStack<Integer> rod2 = new MyStack<>();
        MyStack<Integer> rod3 = new MyStack<>();
        
        System.out.print("Enter the amount of disk : ");
        int diskCount = input.nextInt();
        
        for(int i = diskCount; i > 0; i--){
            rod1.push(i);
        }
        System.out.println("Before move");
        System.out.println("Element in rod 1 " + rod1.toString());
        System.out.println("Element in rod 2 " + rod2.toString());
        System.out.println("Element in rod 3 " + rod3.toString());
        
        moveDisk(diskCount, rod1, rod2, rod3);
    }
    
    public static void moveDisk(int diskSize, MyStack source, MyStack auxiliary, MyStack destination){
        if(diskSize == 1){
            Object val = source.pop();
            destination.push(val);
            System.out.println("Element in rod 1 " + source.toString());
            System.out.println("Element in rod 2 " + auxiliary.toString());
            System.out.println("Element in rod 3 " + destination.toString());
            return;
        }
        
        moveDisk(diskSize - 1, source, destination, auxiliary);
        
        Object val = source.pop();
        destination.push(val);
        System.out.println("Element in rod 1 " + source.toString());
        System.out.println("Element in rod 2 " + auxiliary.toString());
        System.out.println("Element in rod 3 " + destination.toString());
        
        moveDisk(diskSize - 1, auxiliary, source, destination);
    }
}
