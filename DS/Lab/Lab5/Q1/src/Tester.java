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
        LinkedStack<String> list = new LinkedStack<>();
        Random rand = new Random();
        String[] color = {"blue", "orange", "red", "yellow"};
        
        int numOfCandy = rand.nextInt(10) + 1;
        
        for(int i = 0; i < numOfCandy; i++){
            int choice = rand.nextInt(4);
            switch(choice){
                case 0 -> list.push(color[0]);
                case 1 -> list.push(color[1]);
                case 2 -> list.push(color[2]);
                case 3 -> list.push(color[3]);
            }
        }
        
        logic(list);
    } 
    
    public static void logic(LinkedStack<String> list){ 
        LinkedStack<String> temp = new LinkedStack<>();
        
        System.out.println("The candies in the container :");
        
        while(!list.isEmpty()){
            String currColor = list.pop();
            
            if(!currColor.equals("blue")){
                temp.push(currColor);
            }
            
            System.out.print("<-- " + currColor);
        }
        System.out.println("");
        
        while(!temp.isEmpty()){
            list.push(temp.pop());
        }
        
        System.out.println("Ali takes all the candies one by one from the container and eats the blue ones");
        System.out.println("He puts back the rest of the candies in the container");
        System.out.println("The candies in the container");
        while(!list.isEmpty()){
            String currColor = list.peek();
            System.out.print("<-- " + currColor);
            list.pop();
        }
        System.out.println("");
    }
}
