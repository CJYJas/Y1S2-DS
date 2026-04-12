/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class TestIntMyStack {
    Scanner input = new Scanner(System.in);
    MyStack<Integer> list = new MyStack();
    
    public void pushList(){
        System.out.println("Enter integer : (-1 to stop)");
        int val;
        
        do{
            val = input.nextInt();
            if(val != -1){
                list.push(val);
            }
        }while(val != -1);
    }
    
    public void printStackCount(){
        System.out.println("Number of element in stack : " + list.getSize());
    }
    
    public void printContent(){
        System.out.println("ELement in stack : ");
        while(!list.isEmpty()){
            System.out.print(list.pop() + " --> ");
        }
        System.out.println("");
    }
}
